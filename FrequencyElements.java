import java.util.HashMap;
import java.util.Map;

public class FrequencyElements {
    public static void main(String[] args) {
        String [] s={"apple", "banana", "apple", "orange"};
        Map<String,Integer> hp=new HashMap<>();
        for(String i:s){
            hp.put(i,hp.getOrDefault(i,0)+1);
        }
        System.out.println(hp);
    }
}
