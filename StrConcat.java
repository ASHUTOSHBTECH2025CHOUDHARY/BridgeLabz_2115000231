public class StrConcat {
    public static void main(String[] args) {
        String s = "hello";
        int n = 1_000_000;

        // Using StringBuilder
        long t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (t2 - t1) + " ms");

        // Using StringBuffer
        t1 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append(s);
        }
        t2 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (t2 - t1) + " ms");
    }
}

