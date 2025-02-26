import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class User {
    private String userName;
    private int userAge;
    private String userEmail;
    public User(String userName, int userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }
    public String getUserName() { return userName; }
    public int getUserAge() { return userAge; }
    public String getUserEmail() { return userEmail; }
}

public class ListToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper jsonHandler = new ObjectMapper();
            List<User> users = Arrays.asList(
                    new User("Ashutosh", 25, "ashutosh@example.com"),
                    new User("Rohan", 30, "rohan@example.com"),
                    new User("Vikas", 28, "vikas@example.com")
            );
            String jsonArray = jsonHandler.writerWithDefaultPrettyPrinter().writeValueAsString(users);
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
