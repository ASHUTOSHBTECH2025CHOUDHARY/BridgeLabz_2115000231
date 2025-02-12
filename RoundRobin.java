class Linkedlist {
    class Node {
        private int process_id; // Process ID
        private int burst_time; // Burst Time
        private int priority; // Priority
        private Node next; // Next Node

        // Constructor
        public Node(int process_id, int burst_time, int priority) {
            this.process_id = process_id;
            this.burst_time = burst_time;
            this.priority = priority;
            this.next = null;
        }
    }

    private Node head; // Head Node
    private Node tail; // Tail Node

    // Add process at end
    public void addProcess(int process_id, int burst_time, int priority) {
        Node new_Node = new Node(process_id, burst_time, priority);
        if (head == null) {
            head = new_Node;
            tail = new_Node;
            tail.next = head;
        } else {
            tail.next = new_Node;
            new_Node.next = head;
            tail = new_Node;
        }
    }

    // Remove process by ID
    public void removeProcess(int process_id) {
        if (head == null) {
            System.out.println("Process list is empty!");
            return;
        }
        Node current = head, prev = null;
        if (head.process_id == process_id) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Process " + process_id + " completed and removed.");
            return;
        }
        do {
            prev = current;
            current = current.next;
            if (current.process_id == process_id) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                System.out.println("Process " + process_id + " completed and removed.");
                return;
            }
        } while (current != head);
        System.out.println("Process " + process_id + " not found!");
    }

    // Round Robin Scheduling Simulation
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        int totalWaitingTime = 0, totalTurnAroundTime = 0, processCount = 0;
        Node current = head;
        while (head != null) {
            System.out.println("Executing Process " + current.process_id);
            if (current.burst_time > timeQuantum) {
                current.burst_time -= timeQuantum;
                tail = current;
                current = current.next;
            } else {
                totalWaitingTime += totalTurnAroundTime;
                totalTurnAroundTime += current.burst_time;
                processCount++;
                int processId = current.process_id;
                current = current.next;
                removeProcess(processId);
            }
            if (current == null) break;
        }
        System.out.println("Average Waiting Time: " + (totalWaitingTime / (double) processCount));
        System.out.println("Average Turnaround Time: " + (totalTurnAroundTime / (double) processCount));
    }
    public void display(){
        if(head==null){
            return;
        }
        Node node=head;
        while(node!=tail){
            System.out.println(node.burst_time+", "+ node.priority+", "+ node.process_id);
            node=node.next;
        }
        return;
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        Linkedlist scheduler = new Linkedlist();
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);
        scheduler.display();
        int timeQuantum = 4;
        scheduler.roundRobinScheduling(timeQuantum);
    }
}
