import java.util.*;

public class ReverseMapping {
    public static <K, V> Map<V, List<K>> flipMap(Map<K, V> input) {
        Map<V, List<K>> result = new HashMap<>();

        for (Map.Entry<K, V> entry : input.entrySet()) {
            result.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("X", 10);
        data.put("Y", 20);
        data.put("Z", 10);

        Map<Integer, List<String>> flipped = flipMap(data);

        System.out.println("Flipped Map: " + flipped);
    }
}
