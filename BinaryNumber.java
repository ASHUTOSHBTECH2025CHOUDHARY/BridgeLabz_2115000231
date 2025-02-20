import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumber {
    public static void main(String[] args) {
        int n=5;
        List<String> binary=getBinary(n);
        System.out.println(binary);
    }
    public static List<String> getBinary(int n){
        ArrayList<String> res=new ArrayList<>();
        Queue<String> que=new LinkedList<>();
        que.add("1");
        for(int i=0;i<n;i++){
            String front=que.poll();
            res.add(front);
            que.add(res+"0");
            que.add(res+"1");

        }
        return res;
    }
}
