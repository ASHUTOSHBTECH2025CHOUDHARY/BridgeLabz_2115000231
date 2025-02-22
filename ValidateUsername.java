public class ValidateUsername {
    //method to validate username
    private static boolean isValid(String username){
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(pattern);
    }
    public static void main(String[] args) {
        System.out.println(isValid("user_123"));
        System.out.println(isValid("123user"));
        System.out.println(isValid("us"));
    }
}
