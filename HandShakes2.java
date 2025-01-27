import java.util.Scanner;

public class HandShakes2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int students=sc.nextInt();
        int handshakes=find_Handshakes(students);
        System.out.println("Total no of handshakes are "+handshakes);
    }
    public static int find_Handshakes(int students){
        int handshakes=(students*(students-1))/2;
        return handshakes;
    }
}
