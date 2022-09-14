public class Creation {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Abhay");   //Checks reference
        StringBuffer sb2 = new StringBuffer("Abhay");   //Also checks reference

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
    }
}
