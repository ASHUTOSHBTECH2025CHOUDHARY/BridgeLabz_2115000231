import java.util.*;

class Insurance implements Comparable<Insurance> {
    private String insId;
    private String clientName;
    private Date endDate;
    private String insType;
    private double cost;

    // Constructor
    public Insurance(String insId, String clientName, Date endDate, String insType, double cost) {
        this.insId = insId;
        this.clientName = clientName;
        this.endDate = endDate;
        this.insType = insType;
        this.cost = cost;
    }

    // Getters
    public String getInsId() { return insId; }
    public Date getEndDate() { return endDate; }
    public String getInsType() { return insType; }

    // Check equality
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Insurance ins = (Insurance) obj;
        return Objects.equals(insId, ins.insId);
    }

    // Generate hash
    @Override
    public int hashCode() {
        return Objects.hash(insId);
    }

    // Compare dates
    @Override
    public int compareTo(Insurance other) {
        return this.endDate.compareTo(other.endDate);
    }

    // String representation
    @Override
    public String toString() {
        return "Insurance{" +
                "insId='" + insId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", endDate=" + endDate +
                ", insType='" + insType + '\'' +
                ", cost=" + cost +
                '}';
    }
}

public class InsurancePolicy {
    private Set<Insurance> basicSet = new HashSet<>();
    private Set<Insurance> orderSet = new LinkedHashSet<>();
    private Set<Insurance> sortedSet = new TreeSet<>();

    // Add policy
    public void insertPolicy(Insurance ins) {
        basicSet.add(ins);
        orderSet.add(ins);
        sortedSet.add(ins);
    }

    // Show all
    public void showPolicies() {
        System.out.println("Basic Set: " + basicSet);
        System.out.println("Ordered Set: " + orderSet);
        System.out.println("Sorted Set: " + sortedSet);
    }

    // Near expiry
    public void showExpiring() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date limit = cal.getTime();

        System.out.println("Expiring soon:");
        for (Insurance ins : sortedSet) {
            if (ins.getEndDate().before(limit)) {
                System.out.println(ins);
            }
        }
    }

    // Filter type
    public void showByType(String type) {
        System.out.println("Type: " + type);
        for (Insurance ins : basicSet) {
            if (ins.getInsType().equalsIgnoreCase(type)) {
                System.out.println(ins);
            }
        }
    }

    // Find repeats
    public void checkDuplicates() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Insurance ins : basicSet) {
            countMap.put(ins.getInsId(), countMap.getOrDefault(ins.getInsId(), 0) + 1);
        }
        System.out.println("Repeated IDs:");
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("ID: " + entry.getKey() + " count: " + entry.getValue());
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        PolicyTracker tracker = new PolicyTracker();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.MARCH, 15);
        Insurance ins1 = new Insurance("IN", "Tom Lee", cal.getTime(), "Health", 550.0);

        cal.set(2025, Calendar.FEBRUARY, 20);
        Insurance ins2 = new Insurance("INS", "Mary Kay", cal.getTime(), "Auto", 650.0);

        cal.set(2025, Calendar.APRIL, 10);
        Insurance ins3 = new Insurance("INS", "Bob Ray", cal.getTime(), "Home", 1300.0);

        tracker.insertPolicy(ins1);
        tracker.insertPolicy(ins2);
        tracker.insertPolicy(ins3);

        tracker.showPolicies();
        tracker.showExpiring();
        tracker.showByType("Auto");
    }
}
