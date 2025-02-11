class LinkedList{
    Node head;
    class Node{
        private String Movie_Title;
        private String Director;
        private int Year;
        private int rating;
        Node prev=null;
        Node next=null;
        public Node(String Movie_Title,String Director,int Year,int rating){
            this.Movie_Title=Movie_Title;
            this.Director=Director;
            this.Year=Year;
            this.rating=rating;
        }
    }
    public void addLast(String Movie_Title,String Director,int Year,int rating){
        Node new_Node=new Node(Movie_Title,Director,Year,rating);
        if(head==null){
            head=new_Node;
            return;
        }
        Node node=head;
        while(node.next!=null) {
            node=node.next;
        }
        new_Node.next=node.next;
        node.next=new_Node;
        new_Node.prev=node;
    }
    public void addFirst(String Movie_Title,String Director,int Year,int rating){
        Node new_Node=new Node(Movie_Title,Director,Year,rating);
        if(head==null){
            head=new_Node;
            return;
        }
        Node node=head;
        new_Node.next=node;
        node.prev=new_Node;
    }

}
public class MovieManagementSystem {
    public static void main(String[] args) {

    }
}
