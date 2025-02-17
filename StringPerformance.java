public class StringPerformance {
    public static void main(String[] args) {
        int N = 1000000;

        // Using String
        long start1 = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        long timeString = System.nanoTime() - start1;

        // Using StringBuilder
        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        long timeStringBuilder = System.nanoTime() - start2;

        // Using StringBuffer
        long start3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");
        }
        long timeStringBuffer = System.nanoTime() - start3;

        System.out.println("Time taken by String        " + (timeString / 1000000) + " ms");
        System.out.println("Time taken by StringBuilder " + (timeStringBuilder / 1000000) + " ms");
        System.out.println("Time taken by StringBuffer " + (timeStringBuffer / 1000000) + " ms");
    }
}

