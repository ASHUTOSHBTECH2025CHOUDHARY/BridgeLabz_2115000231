public class ValidateLicensePlate {
    //validate license plate
    private static boolean isValid(String plateNo){
        String pattern = "^[A-Z]{2}\\d{4}$";
        return plateNo.matches(pattern);
    }
    public static void main(String[] args) {
        if(isValid("AB1234")){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
