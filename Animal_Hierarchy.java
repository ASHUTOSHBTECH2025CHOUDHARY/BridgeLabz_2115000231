abstract class Animal{
    // Instance Variables of the Animal class
    private String name;
    private int    age;
    // initializing instance variables using constructor
    Animal(String name,int age){
        this.age=age;
        this.name=name;
    }
    //method to make sound
    public abstract  void makeSound();
}
class Dog extends Animal{
    //using super with constructor to call parent constructor;
    Dog(String name,int age){
        super(name,age);
    }
    // method to make sound for dog
    @Override  public  void makeSound(){
        System.out.println("Sound from Dog Class");
    }
}
class Cat extends Animal{
    //using super with constructor to call parent constructor;
    Cat(String name,int age){
        super(name,age);
    }
    // method to make sound for dog
    @Override  public  void makeSound(){
        System.out.println("Sound from Cat Class");
    }
}
class Bird extends Animal{
    //using super with constructor to call parent constructor;
    Bird(String name,int age){
        super(name,age);
    }
    // method to make sound for dog
    @Override  public  void makeSound(){
        System.out.println("Sound from Bird Class");
    }
}
public class Animal_Hierarchy {
    public static void main(String[] args) {
        // Creating objects of all subclass and base class, and calling makeSound
        Dog tommy=new Dog("Tommy",5);
        Cat kitty=new Cat("Kitty",4);
        Bird chidiya=new Bird("Chididya",1);
        tommy.makeSound();
        kitty.makeSound();
        chidiya.makeSound();
    }
}
