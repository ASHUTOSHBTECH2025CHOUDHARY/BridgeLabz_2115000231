//Animal Class
class Animal{
    public void makeSound(){
        System.out.println("Sound form Animal");
    }
}
//Dog class
class Dog extends Animal{
   //Method is overriding method in animal class
    @Override
    public void makeSound(){
        System.out.println("Sound from Dog");
    }
}
public class OverrideUsage {
    public static void main(String[] args) {
        //Creating instance of Dog class
        Dog dog=new Dog();
        dog.makeSound();
    }
}
