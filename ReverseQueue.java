import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        //Creating queue
        Queue<Integer> que;
        que.add(1);
        que.add(2);
        que.add(3);
        //Printing queue
        System.out.println(que);
        //Reversing queue
        reverseQueue(que);
        //Printing Reversed Queue
        System.out.println(que);
    }
    //Function to reverse queue
    public static void reverseQueue(Queue<Integer> que){
        if(que.isEmpty()) return;
        int front=que.poll();
        reverseQueue(que);
        que.add(front);
    }
}