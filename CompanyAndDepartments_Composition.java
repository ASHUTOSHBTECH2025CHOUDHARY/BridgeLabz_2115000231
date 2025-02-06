    import java.util.ArrayList;

    class Employee{
        // Instance Variables
        private String name;
        private int    age;
        // using constructor to initialize object
        Employee(String name,int age){
            this.name=name;
            this.age=age;
        }
        //method to get emp
        public String getEmpName(){
            return name;
        }
    }
    class Department{
        //Instance Variables
        private String depName;
        private ArrayList<Employee> employees;
        Department(String depName){
            this.depName=depName;
            this.employees=new ArrayList<Employee>();
        }
        //method to add employee in the department
        public void addEmployee(Employee employee){
            employees.add(employee);
        }
        //method to get department
        public String getDepName(){
            return depName;
        }
        //method to delete employee
        public void deleteEmployee(){
            for(Employee i:employees){
                System.out.print(i.getEmpName()+" ");
            }
            System.out.println("is deleted");
            employees.clear();
        }
    }
    class Company{
        //Instance variable
        private String Name;
        private ArrayList<Department> departments;
        // using constructor to initializing object
        Company(String Name){
            this.Name=Name;
            this.departments=new ArrayList<Department>();
        }
        //method to add department in the Company
        public void adddepartment(Department department,Employee employee){
            department.addEmployee(employee);
            if(!departments.contains(department)) departments.add(department);
        }
        //method to delete company
        public void delteCompany(){
            System.out.println("From Company "+Name);
            for(Department i:departments){
                System.out.println("Deleting department "+i.getDepName());
                i.deleteEmployee();
            }
            departments.clear();
        }
    }
    public class CompanyAndDepartments_Composition {
        public static void main(String[] args) {
            //Creating Employee object
            Employee ashutosh=new Employee("Ashutosh",21);
            Employee sparsh=new Employee("sparsh",21);
            //Creating Department object
            Department SoftwareDeveloper=new Department("Software Developer");
            //Creating Company object
            Company Capgemini=new Company("Capgemini");
            Capgemini.adddepartment(SoftwareDeveloper,ashutosh);
            Capgemini.adddepartment(SoftwareDeveloper,sparsh);
            Capgemini.delteCompany();
        }
    }
