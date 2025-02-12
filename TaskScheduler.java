class Linkedlist{
    class Node{
        private int task_id; // Task ID
        private String task_name; // Task Name
        private int Priority; // Task Priority
        private String Due_date; // Due Date
        private Node next; // Next Node

        // Constructor
        public Node(int task_id,String task_name,int Priority,String Due_Date){
            this.task_id=task_id;
            this.Due_date=Due_Date;
            this.Priority=Priority;
            this.task_name=task_name;
            this.next=null;
        }
    }
    private Node head; // Head Node
    private Node tail; // Tail Node

    // Add at beginning
    public void addFirst(int task_id,String task_name,int Priority,String Due_date){
        Node new_Node=new Node(task_id,task_name,Priority,Due_date);
        if(head==null){
            head=new_Node;
            tail=new_Node;
            tail.next=head;
        }
        tail.next=new_Node;
        new_Node.next=head;
        head=new_Node;
    }

    // Add at end
    public void addLast(int task_id,String task_name,int Priority,String Due_date){
        Node new_Node=new Node(task_id,task_name,Priority,Due_date);
        if(head==null){
            head=new_Node;
            tail=new_Node;
            tail.next=head;
        }
        tail.next=new_Node;
        new_Node.next=head;
        tail=new_Node;
    }

    // Add at position
    public void addPosition(int task_id, String task_name, int Priority, String Due_date, int position) {
        Node new_Node = new Node(task_id, task_name, Priority, Due_date);
        if (position == 1) {
            addFirst(task_id, task_name, Priority, Due_date);
            return;
        }
        Node temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        if (temp.next == head) { // Add at end
            addLast(task_id, task_name, Priority, Due_date);
            return;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
    }

    // Display tasks
    public void display(){
        if(head==null) return;
        Node node=head;
        while(node!=tail){
            System.out.println(node.Due_date+", "+node.task_name+", "+node.Priority+", "+node.task_id);
            node=node.next;
        }
    }

    // Remove task by ID
    public void removeByTaskId(int task_id) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }
        Node current = head, prev = null;
        if (head.task_id == task_id) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Task with ID " + task_id + " removed.");
            return;
        }
        do {
            prev = current;
            current = current.next;
            if (current.task_id == task_id) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                System.out.println("Task with ID " + task_id + " removed.");
                return;
            }
        } while (current != head);
        System.out.println("Task with ID " + task_id + " not found!");
    }

    // Search by priority
    public void Search(int Priority){
        if(head==null){
            return;
        }
        Node node=head;
        while(node!=null&&node.Priority!=Priority){
            node=node.next;
        }
        if(null==node) return;
        System.out.println(node.task_name);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Linkedlist taskList = new Linkedlist();
        taskList.addLast(1, "Task A", 2, "2025-02-15");
        taskList.addLast(2, "Task B", 1, "2025-02-20");
        taskList.addFirst(3, "Task C", 3, "2025-02-10");
        taskList.addPosition(4, "Task D", 2, "2025-02-18", 2);
        taskList.display();
        taskList.removeByTaskId(3);
        taskList.Search(2);
    }
}
