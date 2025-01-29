import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int [] fre=new int[26];
        if(str1.length()!= str2.length()) {
            System.out.println("Not a Anagram");
            return;
        }
        for(int i=0;i<str1.length();i++){
            fre[str1.charAt(i)]++;
        }
        for(int i=0;i<str1.length();i++){
            fre[str2.charAt(i)]--;
        }
        for(int i=0;i<str1.length();i++){
            if(fre[str1.charAt(i)]!=0){
                System.out.println("Not a Anagram");
                return;
            }
        }
        System.out.println("It is a Anagram");
    }
}