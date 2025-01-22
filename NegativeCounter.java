import java.util.Scanner;

public  class NegativeCounter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int temp = -1;
        boolean found=true;
        while ((found==true)||(temp>0)) {

            temp = sc.nextInt();
            if(temp<=0){
                break;
            }
            sum += temp;
            found=false;
        }
        System.out.println(sum);
    }
}