import java.util.PriorityQueue;
import java.util.Comparator;

// Class to represent a Patient
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

// Comparator to prioritize
class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.severity, p1.severity);
    }
}

public class Hospital {
    public static void main(String[] args) {
        // PriorityQueue
        PriorityQueue<Patient> pq = new PriorityQueue<>(new PatientComparator());

        // Adding patients to the queue
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        // Processing patients
        System.out.println("Order of treatment:");
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
