import java.util.Scanner;

public class Toggel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String toggelstring="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z') toggelstring +=Character.toUpperCase(s.charAt(i));
            else toggelstring +=Character.toLowerCase(s.charAt(i));
        }
        System.out.println("Original String "+s);
        System.out.println("Toggeled String "+toggelstring);
    }
}
