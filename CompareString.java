import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int result=compareString(str1,str1);
        if (result < 0) {
            System.out.println(str1+" comes before "+str2 +" in lexicographical order");
        } else if (result > 0) {
            System.out.println(str2+" comes before "+str1 +" in lexicographical order");
        } else {
            System.out.println(str1+" and "+str2 +" both are equal in lexicographical order");
        }
    }

    public static int compareString(String str1,String str2) {
        int minl=Math.min(str1.length(),str2.length());
        for(int i=0;i<minl;i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                return -1;
            } else if (ch1 > ch2) {
                return 1;
            }
        }

        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() >str2.length()) {
            return 1;
        }
        return 0;
    }
}
