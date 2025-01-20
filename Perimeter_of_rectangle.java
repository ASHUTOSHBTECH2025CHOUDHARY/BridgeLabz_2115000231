import java.util.Scanner;

public  class Perimeter_of_rectangle {
    public  static void  main(String [] args){
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double breath=sc.nextDouble();
        double perimeter=2*(length+breath);
        System.out.println(perimeter);
    }
}
