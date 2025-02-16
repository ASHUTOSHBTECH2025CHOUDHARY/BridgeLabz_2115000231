import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    private static String removeDuplicate(String s){
        //Creating StringBuilder and hashSet
        StringBuilder sb=new StringBuilder();
        HashSet<Character> found=new HashSet<>();
        //removing duplicate elements
        for(char i:s.toCharArray()){
            if(!found.contains(i)){
                sb.append(i);
                found.add(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // Taking input for string
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to  reverse here:-");
        String s=sc.nextLine();
        //Printing removed Duplicatte String
        System.out.println(removeDuplicate(s));
    }
}
