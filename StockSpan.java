import java.util.Stack;

public class StockSpan {
    private static int[] Stock(int []prices){
        int n=prices.length;
        int []result= new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            result[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());

            // Push current index onto the stack
            st.push(i);
        }
        return result;
        }
    public static void main(String[] args) {
        int [] prices={43,342,34,94,87};
        int [] ans=Stock(prices);
        for (int a:ans){
            System.out.println(a+", ");
        }
    }
}
