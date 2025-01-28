    import java.util.Scanner;

    public class Sum_of_natural_number {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int number=sc.nextInt();
            int sum=find_Sum(number);
            System.out.println(sum);
        }
        public static int find_Sum(int number){
            int sum=0;
            for(int i=1;i<number;i++){
                sum+=i;
            }
            return sum;
        }
    }
