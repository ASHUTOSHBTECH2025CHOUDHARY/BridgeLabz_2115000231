import java.util.LinkedList;

class MyHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 16;
    private LinkedList<Node<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (buckets[index] == null) buckets[index] = new LinkedList<>();
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        if (buckets[index] == null) return null;
        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) return node.value;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(node -> node.key.equals(key));
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("A", 1);
        map.put("B", 2);


        map.remove("A");
        System.out.println("Value for key A after removal: " + map.get("A")); // Output: null
    }
}