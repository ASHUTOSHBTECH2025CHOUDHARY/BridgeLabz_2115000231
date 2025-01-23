    import java.util.Scanner;

    public class Percentage {
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            int math= sc.nextInt();
            int chemistry= sc.nextInt();
            int physics= sc.nextInt();
            double marks=(math+chemistry+physics)/3;
            char grade;
            String remarks;
            if (marks >= 80) {
                grade = 'A';
                remarks = "Level 4, above agency-normalized standards";
            } else if (marks >= 70) {
                grade = 'B';
                remarks = "Level 3, at agency-normalized standards";
            } else if (marks >= 60) {
                grade = 'C';
                remarks = "Level 2, below but approaching agency-normalized standards";
            } else if (marks >= 50) {
                grade = 'D';
                remarks = "Level 1, well below agency-normalized standards";
            } else if (marks >= 40) {
                grade = 'E';
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = 'R';
                remarks = "Remedial standards";
            }

            System.out.println("Your grade is "+grade);
            System.out.println("Remark "+remarks);
        }
    }
