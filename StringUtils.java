import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtils {
    // Method to reverse a string
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean palindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to convert a string to uppercase
    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hedsllo"));
        System.out.println(palindrome("HiasdfiH"));
        System.out.println(upperCase("hellasdfasdfo"));
    }
}

class TestingClass {
    StringUtils su = new StringUtils();
    @Test
    void testingReverse() {
        assertEquals("olleH", su.reverse("Heasdfllo"));
    }

    @Test
    void testingIsPalindrome() {
        assertTrue(su.palindrome("HiasdfiH"));
    }

    @Test
    void testingToUpperCase() {
        assertEquals("HELLO", su.upperCase("heasdfllo"));
    }
}

