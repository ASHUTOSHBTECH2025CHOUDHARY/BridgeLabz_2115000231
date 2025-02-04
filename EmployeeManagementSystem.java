    class Employee{
        //Class members and methods
        private static String companyName="Capgemini";
        private static int totalEmployees=5000;
        public static void  displayTotalEmployees(){
            System.out.println(companyName+" has "+totalEmployees+" of employees");
        }
        // Instance members and methods
        private String name;
        private final String id;
        private String designation;
        // using constructor to initialize Employee object
        Employee(String name,String id,String designation){
            this.designation=designation;
            this.id=id;
            this.name=name;
        }
        //method to display employee details
        public void displayEmployee(){
            System.out.println(this.name+" has employee id "+this.id+" and has a designation of "+this.designation);
        }
    }
    public class EmployeeManagementSystem {
        public static void main(String[] args) {
            // Creating object and initialize using constructor
            Employee ashutosh=new Employee("Ashutosh","23234342","Software Analyst");
            //Checking if ashutosh is instance of Employee
            if(ashutosh instanceof  Employee){
                ashutosh.displayEmployee();
            }
            else{
                System.out.println(" Invalid! Instance of given Employee class");
            }
        }
    }
