import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class IsEven {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(5));
    }
}

class IsEvenTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void testingIsEvenTrue(int number) {
        assertTrue(ParametirizedTesting.isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    void testingIsEvenFalse(int number) {
        assertFalse(ParametirizedTesting.isEven(number));
    }
}
