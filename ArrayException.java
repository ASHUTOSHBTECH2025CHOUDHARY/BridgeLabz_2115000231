import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        try {
            System.out.print("Specify the array size: ");
            int arraySize = inputReader.nextInt();
            Integer[] numberArray = new Integer[arraySize];

            System.out.println("Input " + arraySize);
            for (int i = 0; i < arraySize; i++) {
                numberArray[i] = inputReader.nextInt();
            }
            int accessIndex = inputReader.nextInt();
            System.out.println(accessIndex+ numberArray[accessIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The specified index is out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("The array has not been initialized!");
        } catch (Exception e) {
            System.out.println("Invalid input provided.");
        }
    }
}