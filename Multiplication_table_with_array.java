    import java.util.Scanner;

    public class Multiplication_table_with_array {
        public static void main(String [] args){
            //Declaration of array and variables and creating scanner object
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int number= sc.nextInt();
            int [] tabel=new int[11];
            // Calculating table
            for(int i=1;i<tabel.length;i++){
                tabel[i]=i*number;
            }
            //printing table
            for(int i=1;i<tabel.length;i++){
                System.out.println(number+" * "+i+" = "+tabel[i]);
            }
        }
    }