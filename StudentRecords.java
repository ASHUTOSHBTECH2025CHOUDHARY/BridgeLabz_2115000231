    class LinkedList{

        private Node head;
        //Nested class
        class Node{
            private int Roll_Number;
            private String Name;
            private int    Age;
            private String Grade;
            Node    next;
            //using constructor to initialize Node class
            public Node(int Roll_Number,String Name,int Age,String Grade){
                this.Age=Age;
                this.Grade=Grade;
                this.Name=Name;
                this.Roll_Number=Roll_Number;
                this.next=null;
            }
        }
        //method to add at last
        public void addLast(int Roll_Number,String Name,int Age,String Grade){
            Node new_Node=new Node(Roll_Number,Name,Age,Grade);
            if(head==null) {
                head = new_Node;
                return;
            }
            Node node=head;
            while(node.next!=null){
                node=node.next;
            }
            node.next=new_Node;
        }
        //method to add at first
        public void addFirst(int Roll_Number,String Name,int Age,String Grade){
            Node new_Node=new Node(Roll_Number,Name,Age,Grade);
            new_Node.next=head;
            head=new_Node;
        }
        //method to add index
        public void addIndex(int Roll_Number,String Name,int Age,String Grade,int position){
            Node new_Node=new Node(Roll_Number,Name,Age,Grade);
            new_Node.next=null;
            if(head==null) {
                head = new_Node;
                return;
            }
            if(position==1){
                new_Node.next=head;
                head=new_Node;
                return;
            }
            Node node=head;
            int i=1;
            while(node.next!=null&&i<position-1){
                node=node.next;
                i++;
            }
            if(node.next==null) return;
            new_Node.next=node.next;
            node.next=new_Node;
            return;
        }
        //methods to delete node
        public void delete(int roll) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            if (head.Roll_Number == roll) {
                head = head.next;
                return;
            }

            Node node = head;
            while (node.next != null && node.next.Roll_Number != roll) {
                node = node.next;
            }
            if (node.next == null) {
                System.out.println("Roll number " + roll + " not found!");
                return;
            }
            node.next = node.next.next;
        }
        //mehods to updategrade
        public void updategrad(int roll,String s){
            Node node=head;
            if(node==null){
                return;
            }
            while(node!=null && node.Roll_Number!=roll){
                node=node.next;
            }
            if(node==null) return;
            node.Grade=s;
        }
        //method to search in a linked list
        public void search(int roll){
            Node node=head;
            if(node==null){
                return;
            }
            while(node!=null && node.Roll_Number!=roll){
                node=node.next;
            }
            if(node==null) return;
            System.out.println(node.Roll_Number+", "+node.Age+", "+node.Name+", "+node.Grade);
        }
        //method to display linkedlist
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.Roll_Number+", "+temp.Age+", "+temp.Name+", "+temp.Grade);
                temp=temp.next;
            }
            return;
        }
    }
    public class StudentRecords {
        public static void main(String[] args) {
            //Creating linked list and adding nodes
            LinkedList ll=new LinkedList();
            ll.addLast(12,"Ashutosh",32,"A");
            ll.addLast(11,"Ashutosh",32,"A");
            ll.addLast(13,"Ashutosh",32,"A");
            //updating grade
            ll.updategrad(13,"A+");
            ll.display();
        }
    }
