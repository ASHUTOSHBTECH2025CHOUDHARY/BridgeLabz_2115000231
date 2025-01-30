import java.util.Scanner;

class  Officedatabase{
    public int id;
    public int salary;
    public String name;
    Officedatabase(int id,int salary,String name){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    public void details(){
        System.out.println("Employee "+name+" has "+salary+" salary and has id "+id);
    }
}
public class Employee {
    public static void main(String[] args) {
        System.out.println("Enter id, name and salary of employee");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        int salary= sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        Officedatabase Employee=new Officedatabase(id,salary,name);
        Employee.details();
    }
}