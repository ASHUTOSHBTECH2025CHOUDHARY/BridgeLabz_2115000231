import java.time.LocalDate;
import java.util.*;

class Policy {
    private String num;
    private String holder;
    private LocalDate expiry;

    public Policy(String num, String holder, LocalDate expiry) {
        this.num = num;
        this.holder = holder;
        this.expiry = expiry;
    }

    public String getNum() {
        return num;
    }

    public String getHolder() {
        return holder;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    @Override
    public String toString() {
        return "Num: " + num + ", Holder: " + holder + ", Expiry: " + expiry;
    }
}

class PolicyManager {
    private Map<String, Policy> map = new HashMap<>();
    private Map<String, Policy> orderMap = new LinkedHashMap<>();
    private NavigableMap<LocalDate, List<Policy>> sortedMap = new TreeMap<>();

    public void add(Policy p) {
        map.put(p.getNum(), p);
        orderMap.put(p.getNum(), p);
        sortedMap.computeIfAbsent(p.getExpiry(), k -> new ArrayList<>()).add(p);
    }

    public Policy getByNum(String num) {
        return map.get(num);
    }

    public List<Policy> getExpiring() {
        List<Policy> expiring = new ArrayList<>();
        LocalDate now = LocalDate.now();
        LocalDate threshold = now.plusDays(30);
        for (Map.Entry<LocalDate, List<Policy>> e : sortedMap.subMap(now, true, threshold, true).entrySet()) {
            expiring.addAll(e.getValue());
        }
        return expiring;
    }

    public List<Policy> getByHolder(String holder) {
        List<Policy> list = new ArrayList<>();
        for (Policy p : map.values()) {
            if (p.getHolder().equalsIgnoreCase(holder)) {
                list.add(p);
            }
        }
        return list;
    }

    public void removeExpired() {
        LocalDate now = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<Policy>>> it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<LocalDate, List<Policy>> e = it.next();
            if (e.getKey().isBefore(now)) {
                for (Policy p : e.getValue()) {
                    map.remove(p.getNum());
                    orderMap.remove(p.getNum());
                }
                it.remove();
            }
        }
    }
}

public class PolicyManager {
    public static void main(String[] args) {
        PolicyManager pm = new PolicyManager();

        pm.add(new Policy("P123", "Alice", LocalDate.now().plusDays(10)));
        pm.add(new Policy("P124", "Bob", LocalDate.now().plusDays(40)));
        pm.add(new Policy("P125", "Alice", LocalDate.now().plusDays(20)));
        pm.add(new Policy("P126", "Charlie", LocalDate.now().minusDays(5)));

        System.out.println( pm.getByNum("P123"));

        System.out.println("Expiring in 30 days:");
        for (Policy p : pm.getExpiring()) {
            System.out.println(p);
        }

        System.out.println("Policies for Alice:");
        for (Policy p : pm.getByHolder("Alice")) {
            System.out.println(p);
        }

        pm.removeExpired();
        System.out.println("Expired policies removed.");
    }
}

