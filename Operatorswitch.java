import java.util.Scanner;

public class Operatorswitch {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double number= sc.nextInt();;;
        double number1= sc.nextInt();
        String operator=sc.nextLine();
        switch (operator) {
            case "+":
                System.out.println("Result: " + (number + number1));
                break;
            case "-":
                System.out.println("Result: " + (number - number1));
                break;
            case "*":
                System.out.println("Result: " + (number * number1));
                break;
            case "/":
                if (number1 != 0) {
                    System.out.println("Result: " + (number / number1));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter one of +, -, *, or /.");
        }
    }
}