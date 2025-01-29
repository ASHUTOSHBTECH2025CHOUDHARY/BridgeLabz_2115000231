import java.util.Scanner;

public class Pallindrom2 {
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrome(s)==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not  a Palindrome");
        }
    }
}

