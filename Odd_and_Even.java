import java.util.Scanner;

public class Odd_and_Even {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural Number");
        int number= sc.nextInt();
        if(number<=0){
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        int [] odd=new int[(number/2)+1];
        int [] even=new int[(number/2)+1];
        int oddindex=0;
        int evenindex=0;
        //finding odd and even number
        for(int i=1;i<=number;i++){
            if(i%2==0&&(evenindex<even.length)){
                even[evenindex]=i;
                evenindex++;
            }
            else if(oddindex<odd.length){
                odd[oddindex]=i;
                oddindex++;
            }
        }
        //printing even and odd array
        System.out.println("Printing Even array");
        for(int i=0;i<odd.length;i++){
            System.out.println(even[i]);
        }
        System.out.println("Printing Odd array");
        for(int i=0;i<odd.length;i++){
            System.out.println(odd[i]);
        }
    }
}