class Book{
    //Instance Variables of class Book
    private String title;
    private int    productionYear;
    //using constructor to initializing methods
    Book(String title,int productionYear){
        this.title=title;
        this.productionYear=productionYear;
    }
    //getter function for instance variables
    public String getTitle(){
        return title;
    }
    public int getProductionYear(){
        return productionYear;
    }
    //method which will override by subclass
    public void displayInfo(){}
}
class Author extends Book{
    //Instance Variables of class Author
    private String name;
    private String bio;
    //using constructor to initializing methods
    Author(String name,String bio,String title,int productionYear){
        super(title,productionYear);
        this.name=name;
        this.bio=bio;
    }
    //method to display Author details
    public void displayInfo(){
        System.out.println(this.name+", "+this.bio+" is wrote the book "+this.getTitle()+" in year "+this.getProductionYear() );
    }
}
public class Library_Management_System {
    public static void main(String[] args) {
        //Creating subclass object
        Author ashutosh=new Author("Ashutosh Choudhary","Bar raised","Don't the bar, raise it",2019);
        //calling method to get details
        ashutosh.displayInfo();
    }
}
