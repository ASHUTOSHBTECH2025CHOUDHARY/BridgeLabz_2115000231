class Person{
    //Instance Variables for object
    protected String name;
    protected String id;
    //using constructor to initialize
    public Person(String name,String id){
        this.name=name;
        this.id=id;
    }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{
    //Instance Variables for object
    private Boolean famous;
    //using constructor to initialize
    public Chef(String name,String id,Boolean famous){
        super(name,id);
        this.famous=famous;
    }
    //implementing Worker
    @Override public void performDuties(){
        System.out.println(name+" "+id+" is famous "+(famous?"Yes":"No"));
    }
}
class Waiter extends Person implements Worker{
    //Instance Variables for object
    private int tableCount;
    //using constructor to initialize
    public Waiter(String name,String id,int tableCount){
        super(name,id);
        this.tableCount=tableCount;
    }
    //implementing Worker
    @Override public void performDuties(){
        System.out.println(name+" "+id+" counted table count "+tableCount);
    }
}
public class Restaurant_Management_System_Hybrid {
    public static void main(String[] args) {
        //Creating and showing its type of subclass
        Waiter waiter=new Waiter("Waiter","34as34",45);
        waiter.performDuties();
        Chef chef=new Chef("chef","343434",true);
        chef.performDuties();
    }
}
