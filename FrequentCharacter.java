public class FrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        char mostFrequentChar = findMostFrequentCharacter(input);

        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }
}
