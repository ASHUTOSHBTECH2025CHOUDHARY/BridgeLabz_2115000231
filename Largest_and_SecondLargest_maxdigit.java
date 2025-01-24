import java.util.Scanner;

public class Largest_and_SecondLargest_maxdigit {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int maxdigit=10;
        int i=0;
        //Decalaration of array
        int [] digit=new int[maxdigit];
        //intialization of an array
        while(number>0) {
            if (i == digit.length - 1) {
                int[] temp = new int[maxdigit + digit.length];//declaraing the temp array with more size
                System.arraycopy(digit, 0, temp, 0, digit.length);//coping the digit arr to temp
                digit = temp;//assigning temp to digit array
            }
            digit[i] = number % 10;
            number /= 10;
            i++;
        }
        //decalaring largest and secondlargest variable with 0;
        int largest=0;
        int secondLargest=0;
        //find the largest and secondlargest digit
        for(int k=0;k<digit.length;k++){
            if (digit[k] > largest) {
                secondLargest = largest;
                largest = digit[k];
            } else if (digit[k] > secondLargest && digit[k] != largest) {

                secondLargest = digit[k];
            }
        }
        System.out.println("Largest and Second Largest numbers are "+largest+", "+secondLargest);

    }
}