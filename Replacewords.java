import java.util.Scanner;

public class Replacewords {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        char ch1=sc.next().charAt(0);
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                newString+=ch1;
            }
            newString+=s.charAt(i);
        }
        System.out.println("New String "+newString);
    }
}
