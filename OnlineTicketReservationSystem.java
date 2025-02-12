class Linkedlist {
    class Node {
        //Instance Variable
        private int ticket_id;
        private String customer_name;
        private String movie_name;
        private String seat_number;
        private String booking_time;
        private Node next;

        // Constructor
        public Node(int ticket_id, String customer_name, String movie_name, String seat_number, String booking_time) {
            this.ticket_id = ticket_id;
            this.customer_name = customer_name;
            this.movie_name = movie_name;
            this.seat_number = seat_number;
            this.booking_time = booking_time;
            this.next = null;
        }
    }
    private Node head; // Head Node
    private Node tail; // Tail Node
    private int totalTickets = 0; // Count of tickets

    // Add at end
    public void addLast(int ticket_id, String customer_name, String movie_name, String seat_number, String booking_time) {
        Node new_Node = new Node(ticket_id, customer_name, movie_name, seat_number, booking_time);
        if (head == null) {
            head = new_Node;
            tail = new_Node;
            tail.next = head;
        } else {
            tail.next = new_Node;
            new_Node.next = head;
            tail = new_Node;
        }
        totalTickets++;
    }

    // Remove by Ticket ID
    public void removeByTicketId(int ticket_id) {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }
        Node current = head, prev = null;
        while (current != tail && current.ticket_id != ticket_id) {
            prev = current;
            current = current.next;
        }
        if (current.ticket_id == ticket_id) {
            if (current == head) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    tail.next = head;
                }
            } else {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
            }
            totalTickets--;
            System.out.println("Ticket with ID " + ticket_id + " removed.");
            return;
        }
        System.out.println("Ticket with ID " + ticket_id + " not found!");
    }

    // Display tickets
    public void display() {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }
        Node node = head;
        while (true) {
            System.out.println(node.ticket_id + ", " + node.customer_name + ", " + node.movie_name + ", " + node.seat_number + ", " + node.booking_time);
            if (node == tail) break;
            node = node.next;
        }
    }

    // Search by Customer Name or Movie Name
    public void search(String key) {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }
        Node node = head;
        boolean found = false;
        while (true) {
            if (node.customer_name.equalsIgnoreCase(key) || node.movie_name.equalsIgnoreCase(key)) {
                System.out.println(node.ticket_id + ", " + node.customer_name + ", " + node.movie_name + ", " + node.seat_number + ", " + node.booking_time);
                found = true;
            }
            if (node == tail) break;
            node = node.next;
        }
        if (!found) System.out.println("No ticket found for " + key);
    }

    // Get total booked tickets
    public int getTotalTickets() {
        return totalTickets;
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        Linkedlist ticketList = new Linkedlist();
        ticketList.addLast(1, "adsfas", "Movie A", "A1", "12:00 PM");
        ticketList.addLast(2, "adsfasdf", "Movie B", "B2", "03:00 PM");
        ticketList.addLast(3, "asdfasf", "Movie A", "A2", "12:00 PM");
        ticketList.display();
        ticketList.removeByTicketId(2);
        ticketList.search("asdfasdf A");
        System.out.println("Total tickets booked " + ticketList.getTotalTickets());
    }
}