public class StringConcatenation {
    private static String Concatenate(String[] arr){
        StringBuilder sb=new StringBuilder();
        for(String i:arr){
            sb.append(i);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] arr={"ashu","asdf","asdfasd","asdfasd"};
        String ans=Concatenate(arr);
        System.out.println(ans);
    }
}
