import java.util.regex.Pattern;

public class Ip {

    private static final String IP_REGEX ="^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
    public static boolean validate(String ipAddress) {
        return Pattern.matches(IP_REGEX, ipAddress);
    }
    public static void main(String[] args) {
        String[] ipAddresses = { "10.0.0.1", "172.16.254.1", "256.256.256.256", "127.0.0", "192.168.0.256", "abc.123.xyz.456" };
        for (String ip : ipAddresses) {
            System.out.println(ip + " -> " + (validate(ip) ? "Valid" : "Invalid"));
        }
    }
}
