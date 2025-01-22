import java.util.Scanner;

public class Tempinfarenite {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int celcius=sc.nextInt();
        System.out.println("The "+celcius+" celsius is "+((celcius*9/5)+32)+" fahrenheit");
    }
}