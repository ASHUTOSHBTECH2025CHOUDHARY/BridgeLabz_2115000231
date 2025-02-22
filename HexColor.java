public class HexColor {
    private static boolean isValid(String color){
        String pattern = "^#([A-Fa-f0-9]{6})$";
        return color.matches(pattern);
    }
    public static void main(String[] args) {
        if(isValid( "#FFA500")){
            System.out.println("Valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}
