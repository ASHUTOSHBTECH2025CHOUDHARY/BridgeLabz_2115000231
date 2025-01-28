public class OTPGenrator {
    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTP numbers and save them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        // Display the generated OTP numbers
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        // Check if the OTP numbers are unique
        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
