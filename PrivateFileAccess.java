import java.lang.reflect.Field;
class Person {
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Method to display age
    public void displayAge() {
        System.out.println("Current Age: " + age);
    }
}

public class PrivateFileAccess {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Class<?> personClass = person.getClass();
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);
            int initialAge = (int) ageField.get(person);
            System.out.println("Initial Age: " + initialAge);
            ageField.set(person, 30);
            int updatedAge = (int) ageField.get(person);
            System.out.println("Updated Age: " + updatedAge);
            person.displayAge();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
