import java.util.Scanner;

public class Grades_of_Students {
    public static void main(String[]args){
        //Declaration of array and variables and creating scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students");
        int person=sc.nextInt();
        int [] maths=new int[person];
        int [] chemistry=new int[person];
        int [] physics=new int[person];
        int [] marks=new int[person];
        String [] remarks=new String[person];
        char [] grade=new char[person];
        //Taking input of marks
        for(int i=0;i<maths.length;i++){
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
            maths[i]=m;
            chemistry[i]=c;
            physics[i]=p;
        }
        // Calculating grades of students and giving remarks according to it
        for(int i=0;i<grade.length;i++){
             marks[i]=(maths[i]+physics[i]+chemistry[i])/3;
            if (marks[i] >= 80) {
                grade[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (marks[i] >= 70) {
                grade[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (marks[i] >= 60) {
                grade[i] = 'C';
                remarks[i] = "Level 2, below but approaching agency-normalized standards";
            } else if (marks[i] >= 50) {
                grade[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (marks[i] >= 40) {
                grade[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grade[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }
        //Printing marks and grads with remarks of students
        for(int i=0;i<grade.length;i++){
            System.out.println("Marks and grade with remark of student "+(i+1)+"= "+marks[i]+", "+remarks[i]+", "+grade[i]);
        }
    }
}
