import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        double Area=base*height*0.5;
        System.out.println(Area);
    }
}