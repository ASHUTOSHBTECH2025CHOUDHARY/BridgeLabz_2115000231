import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    private String manufacturer;
    private String type;
    private int manufactureYear;

    public Car(String manufacturer, String type, int manufactureYear) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.manufactureYear = manufactureYear;
    }
    public String getManufacturer() { return manufacturer; }
    public String getType() { return type; }
    public int getManufactureYear() { return manufactureYear; }
}

public class JavaJSON {
    public static void main(String[] args) {
        try {
            Car obj = new Car("Honda", "Civic", 2024);
            ObjectMapper mapper = new ObjectMapper();
            String jsonOutput = mapper.writeValueAsString(obj);
            System.out.println(jsonOutput);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
