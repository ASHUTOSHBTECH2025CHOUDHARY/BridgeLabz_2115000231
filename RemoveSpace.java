public class RemoveSpace {
    public static String Spaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String input = "This   is   an   example   with   multiple   spaces.";
        System.out.println(Spaces(input));
    }
}

