import java.util.Scanner;

public class ReverseStingBuilder {
    public static void main(String[] args) {
        // Taking input for string
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to  reverse here:-");
        String s=sc.nextLine();
        //Creating String Builder
        StringBuilder sb=new StringBuilder(s);
        //Printing reverse string
        System.out.println(sb.reverse().toString());
    }
}
