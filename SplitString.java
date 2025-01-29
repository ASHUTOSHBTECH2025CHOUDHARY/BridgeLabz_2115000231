import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] words=s.split(" ");
        int index=0,len=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()>len){
                len=words[i].length();
                index=i;
            }
        }
        System.out.println("Longest word in a string "+words[index]);
    }
}
