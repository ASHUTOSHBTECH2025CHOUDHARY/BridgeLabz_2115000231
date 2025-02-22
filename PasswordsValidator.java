import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordsValidator {
    public static boolean ValidPassword(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        System.out.println(ValidPassword("Ashutosh1"));
        System.out.println(ValidPassword("ashutosh"));
    }
}

class PasswordValidatorTest {
    @Test
    void testingValidPasswords() {
        assertTrue(PasswordValidator.ValidPassword("Ashutosh1"));
    }

    @Test
    void testingInvalidPasswords() {
        assertFalse(PasswordValidator.ValidPassword("ashutosh"));
    }
}
