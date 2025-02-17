import java.util.*;

public class HashsetAndTreeset {
    public static void main(String[] args) {
        int datasetSize = 1_000_000;
        Random rand = new Random();
        int searchTarget = rand.nextInt(datasetSize);

        int[] numberArray = new int[datasetSize];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < datasetSize; i++) {
            int randomNum = rand.nextInt(datasetSize);
            numberArray[i] = randomNum;
            hashSet.add(randomNum);
            treeSet.add(randomNum);
        }

        long arrayStartTime = System.nanoTime();
        boolean isFoundInArray = searchArray(numberArray, searchTarget);
        long arraySearchTime = System.nanoTime() - arrayStartTime;

        long hashSetStartTime = System.nanoTime();
        boolean isFoundInHashSet = hashSet.contains(searchTarget);
        long hashSetSearchTime = System.nanoTime() - hashSetStartTime;

        long treeSetStartTime = System.nanoTime();
        boolean isFoundInTreeSet = treeSet.contains(searchTarget);
        long treeSetSearchTime = System.nanoTime() - treeSetStartTime;

        System.out.println("Array Search (" + isFoundInArray + ")   " + (arraySearchTime / 1_000_000.0) + " ms");
        System.out.println("HashSet Search (" + isFoundInHashSet + ")  " + (hashSetSearchTime / 1_000_000.0) + " ms");
        System.out.println("TreeSet Search (" + isFoundInTreeSet + ")  " + (treeSetSearchTime / 1_000_000.0) + " ms");
    }

    public static boolean searchArray(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

