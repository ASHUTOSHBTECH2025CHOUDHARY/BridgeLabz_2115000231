import java.util.ArrayList;

public class SuppressWarningUsage {
    @SuppressWarnings("Unchecked")
    public static void main(String[] args) {
        //Creating SuppressWarning
        ArrayList lists=new ArrayList();
        lists.add("Ashutosh Choudahry");
        lists.add(2);
        lists.add(323.32);
        System.out.println(lists);
    }
}
