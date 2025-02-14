public class CountingSort {
    public static void sortAges(int[] ages) {
        int minAge = 10, maxAge = 18; // Age range (10 to 18)
        int range = maxAge - minAge + 1; // Total possible values
        int[] count = new int[range]; // Count array to store frequency

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative count to determine positions
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Output array to store sorted ages
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            sortedAges[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted ages back to the original array
        System.arraycopy(sortedAges, 0, ages, 0, ages.length);
    }
    public static void main(String[] args) {
        int[] studentAges = {14, 12, 16, 15, 10, 18, 17, 13, 11, 15, 14, 12};
        sortAges(studentAges);
        for (int i:studentAges){
            System.out.print(i+", ");
        }
    }
}
