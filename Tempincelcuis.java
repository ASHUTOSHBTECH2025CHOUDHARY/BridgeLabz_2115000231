import java.util.Scanner;

public class Tempincelcuis {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int Farenite=sc.nextInt();
        System.out.println("The "+((Farenite-32)*5/9)+" celsius is "+Farenite+" fahrenheit");

    }
}