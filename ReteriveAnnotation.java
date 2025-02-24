import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Ashutosh Choudhary")
class MyClass {

}

public class ReteriveAnnotation {
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;
        if (myClass.isAnnotationPresent(Author.class)) {
            Author authorInfo = myClass.getAnnotation(Author.class);
            System.out.println("Author: " + authorInfo.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}
