import java.util.Scanner;

public class Travelcity {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        string name= sc.nextLine();
        string fromcity= sc.nextLine();
        string tocity= sc.nextLine();
        string viacity= sc.nextLine();
        int tovia= sc.nextInt();
        int tofinal= sc.nextInt();
        int toviatime= sc.nextInt();
        int tofinaltime= sc.nextInt();
        int totaldistance=tovia+tofinal;
        int totaltimetaken=tofinaltime+toviatime;
        System.out.println(totaltimetaken+", "+totaldistance);
    }
}
