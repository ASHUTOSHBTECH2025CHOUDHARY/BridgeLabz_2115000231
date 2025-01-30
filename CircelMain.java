import java.util.Scanner;

class Circle{
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void Circumferencee() {
        System.out.println("Circumference of a circle with radius "+this.radius+" is");
        double circum=2.0*(22.0/7)*radius;
        System.out.println(circum);
    }
    public void AreaOfCircle(){
        System.out.println("Area of a circle with radius "+this.radius+" is");
        double area=(22.0/7)*this.radius*this.radius;
        System.out.println(area);
    }
}
public class CircelMain {
    public static void main(String[] args) {
        System.out.println("Enter radius of a circle");
        Scanner sc=new Scanner(System.in);
        int radius= sc.nextInt();
        Circle first=new Circle(radius);
        first.AreaOfCircle();
        first.Circumferencee();
    }
}
