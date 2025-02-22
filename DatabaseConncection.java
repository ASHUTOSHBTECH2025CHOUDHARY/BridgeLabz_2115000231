import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConncection {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Connected Done");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Disconnected Done");
    }

    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        System.out.println(db.isConnected());
        db.disconnect();
        System.out.println(db.isConnected());
    }
}

class DatabaseConnectionTest {
    private DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
    }

    @Test
    void testingConnection() {
        assertTrue(db.isConnected());
    }

    @Test
    void testingDisconnection() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
