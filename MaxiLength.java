import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}
class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateLength(username);
        this.username = username;
    }
private void validateLength(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (username.length() > maxLength) {
                    throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public void displayUser() {
        System.out.println("Username: " + username);
    }
}
public class MaxiLength {
    public static void main(String[] args) {
        try {
            User user1 = new User("Ashu123");
            user1.displayUser();
            User user2 = new User("LongUsername123");
            user2.displayUser();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

