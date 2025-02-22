
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty() || username.length() < 3) {
            throw new IllegalArgumentException("Invalid username");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        System.out.println("User registered successfully: " + username);
    }

    public static void main(String[] args) {
        try {
            registerUser("Ashutosh", "ashutoshbtesch@gmail.com", "Ashutosh43434");
            registerUser("AS", "ashutosh@gmail.com", "Ashutosh123");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}

class UserRegistrationTest {
    @Test
    void testingValidUserRegistration() {
        assertDoesNotThrow(() -> UserRegistration.registerUser("Ashutosh", "ashutoshbtesch@gmail.com", "Ashutosh43434"));
    }

    @Test
    void testingInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("", "ashutosh@gmail.com", "Ashutosh123"));
    }

    @Test
    void testingInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Ashutosh", "", "Ashutosh43434"));
    }

    @Test
    void testingInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> UserRegistration.registerUser("Ashutosh", "ashutosh@gmail.com", "ashutosh"));
    }
}