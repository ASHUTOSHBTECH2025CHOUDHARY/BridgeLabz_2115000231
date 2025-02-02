import java.util.Scanner;

class Circle {
    // attribute to store the radius of the circle
    private int radius;

    // parameterized constructor to initialize radius
    Circle(int radius) {
        if (radius == 0) {
            System.out.println("Please provide radius for circumference and area of circle");
        }
        this.radius = radius;
    }

    // method to calculate and display circumference of the circle
    public void Circumference() {
        System.out.println("Circumference of a circle with radius " + this.radius + " is");
        double circum = 2.0 * (22.0 / 7) * radius;
        System.out.println(circum);
    }

    // default constructor initializing radius to zero
    Circle() {
        this(0);
    }

    // method to calculate and display area of the circle
    public void AreaOfCircle() {
        System.out.println("Area of a circle with radius " + this.radius + " is");
        double area = (22.0 / 7) * this.radius * this.radius;
        System.out.println(area);
    }
}

public class CircelMain {
    public static void main(String[] args) {
        // creating a circle object with default constructor
        Circle first = new Circle();

        // scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        int radius = sc.nextInt();

        // creating a circle object with user-provided radius
        Circle second = new Circle(radius);

        // calculating and displaying area and circumference of the circle
        second.AreaOfCircle();
        second.Circumference();
    }
}