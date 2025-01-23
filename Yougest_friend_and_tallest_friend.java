import java.util.Scanner;

public class Yougest_friend_and_tallest_friend {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        int [] Ages=new int[3];
        int [] heights=new int[3];
        int yougest,tallest;
        //Input of Ages and heights of 3 friends
        for(int i=0;i<Ages.length;i++){
            Ages[i]=sc.nextInt();
        }
        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextInt();
        }
        //Intallizing with vairables
        yougest=Ages[0];tallest=heights[0];
        //finding youngest among three friends
        for(int i=1;i<Ages.length;i++){
            if(yougest<Ages[i]){
                yougest=Ages[i];
            }
        }
        //finding tallest among three friends
        for(int i=1;i<heights.length;i++){
            if(tallest>heights[i]){
                tallest=heights[i];
            }
        }
        System.out.println("Youngest is "+yougest+", tallest is "+tallest);
    }
}
