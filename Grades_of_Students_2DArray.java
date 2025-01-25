import java.util.Scanner;

public class Grades_of_Students_2DArray {
    public static void main(String [] args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students");
        int people= sc.nextInt();
        int [][] marks=new int[people][3];
        int [] percentage=new int[people];
        String [] remarks=new String[people];
        char [] grade=new char[people];
        // Taking marks as input
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks of student ="+(i+1));
            System.out.println("Maths marks");
            int m=sc.nextInt();
            System.out.println("Physics marks");
            int p= sc.nextInt();
            System.out.println("Chemistry marks");
            int c=sc.nextInt();
            while (m<0||p<0||c<0){
                System.out.println("Please Enter the marks in positive number or 0");
                System.out.println("Maths marks");
                m=sc.nextInt();
                System.out.println("Physics marks");
                p= sc.nextInt();
                System.out.println("Chemistry marks");
                c=sc.nextInt();
            }
            marks[i][0]=m;
            marks[i][1]=c;
            marks[i][2]=p;
        }
        // Calculating marks and giving grade and remark to student
        for(int i=0;i<percentage.length;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2]);
            if (percentage[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }
        for(int i=0;i<grade.length;i++){
            System.out.println("Marks and grade with remark of student "+(i+1)+"= "+marks[i][0]+", "+marks[i][1]+", "+marks[i][2] +", "+percentage[i]+", "+remarks[i]+", "+grade[i]);
        }
    }
}