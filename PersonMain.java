import java.util.Scanner;

class Person {
    // Private variables to store the person's name and age
    private String name;
    private int age;

    // Constructor that initializes the person's age and name
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor that creates a new Person by copying another Person's attributes
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
    // Method to display the person's details
    public void showdetails() {
        System.out.println(this.name + " is " + this.age + " old.");
    }
}

public class PersonMain {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of person");
        // Read the person's name and age from the user input
        String name = sc.nextLine();
        int age = sc.nextInt();
        // Create a new Person object using the provided name and age
        Person p1 = new Person(name, age);
        // Create a second Person object by copying p1's details using the copy constructor
        Person p2 = new Person(p1);
        System.out.println("Details of person p");
        // Display the details of the first person and second person
        p1.showdetails();
        p2.showdetails();
    }
}