import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String reverse=reverseString(s);
        System.out.println("Original "+s);
        System.out.println("Reversed "+reverse);
    }
}
