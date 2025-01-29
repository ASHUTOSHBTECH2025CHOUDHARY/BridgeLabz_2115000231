import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        String removed="";
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)) continue;
            removed +=s.charAt(i);
        }
        System.out.println("Modified String: "+ removed);
    }
}