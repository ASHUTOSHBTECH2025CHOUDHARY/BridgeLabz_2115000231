import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int [] fre=new int[26];
        String removeduplicate="";
        for(int i=0;i<s.length();i++){
            if(fre[s.charAt(i)-'a']==0){
                removeduplicate+=s.charAt(i);
                fre[s.charAt(i)-'a']++;
            }
        }
        System.out.println("Original String "+s);
        System.out.println("Without Duplicate String "+removeduplicate);
    }
}
