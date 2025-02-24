import java.lang.annotation.*;
import java.lang.reflect.Field;

// Custom annotation to enforce maximum string length
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface StringSizeLimit {
    int max();
}
class Account {
    @StringSizeLimit(max = 12)
    private String userId;
    public Account(String userId) {
        validateFieldLength(this, userId);
        this.userId = userId;
    }
    private void validateFieldLength(Account instance, String input) {
        try {
            Field fieldRef = Account.class.getDeclaredField("userId");
            if (fieldRef.isAnnotationPresent(StringSizeLimit.class)) {
                int allowedLimit = fieldRef.getAnnotation(StringSizeLimit.class).max();
                if (input.length() > allowedLimit) {
                    throw new IllegalArgumentException("User ID exceeds the allowed length of " + allowedLimit + " characters.");
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
    public String getUserId() {
        return userId;
    }
}

public class AnnotationUsage {
    public static void main(String[] args) {
        try {
            Account validAccount = new Account("Ashu_99");
            System.out.println("Account Created: " + validAccount.getUserId());
            Account invalidAccount = new Account("Ashutosh_Developer");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error" + e.getMessage());
        }
    }
}

