import java.util.Scanner;
import java.util.SequencedSet;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char [] ch={'a','e','i','o','u'};
        System.out.println("Enter String here:");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch[i]){
                    count++;
                }
            }
        }
        System.out.println("Count of vowels "+count);
        System.out.println("Count of Constants "+(s.length()-count));
    }
}
