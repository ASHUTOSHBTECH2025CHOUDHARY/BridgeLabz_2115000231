import java.util.Scanner;

public class CountSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String subStr=sc.nextLine();
        int count=0;
        int index=0;
        while((index=s.indexOf(subStr,index))!=-1){
            index+=subStr.length();
            count++;
        }
        System.out.println("Number of times substring occur "+count);
    }
}
