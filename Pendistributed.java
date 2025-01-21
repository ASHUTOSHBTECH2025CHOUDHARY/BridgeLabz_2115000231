public  class Pendistributed {
    public  static  void main(String [] args){
        int pens=14;
        int students=3;
        int remaning=pens%students;
        int penperstudent=pens/students;
        System.out.println(" The Pen Per Student is "+penperstudent +"and the remaining pen not distributed is "+remaning);
    }
}