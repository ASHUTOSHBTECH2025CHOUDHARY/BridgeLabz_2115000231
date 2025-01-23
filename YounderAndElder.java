import java.util.Scanner;

public class YounderAndElder {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int age1=sc.nextInt();
        int age2= sc.nextInt();
        int age3= sc.nextInt();
        int height1= sc.nextInt();
        int height2= sc.nextInt();
        int height3= sc.nextInt();
        if(age1<age2&&age1<age3){
            System.out.println("Yougest is" + age1);
        }
        else if(age2<age1&&age2<age3){
            System.out.println("Yougest is" + age2);
        }
        else{
            System.out.println("Yougest is" + age3);
        }
        age1=height1;
        age2=height2;
        age3=height3;
        if(age1<age2&&age1<age3){
            System.out.println("Tallest is" + age1);
        }
        else if(age2<age1&&age2<age3){
            System.out.println("Tallest is" + age2);
        }
        else{
            System.out.println("Tallest is" + age3);
        }
    }
}
