public class Example1 {
    public static void main(String[] args) {
        String s1 = new String("Abhay");
        String s2 = new String("Abhay");

        System.out.println(s1==s2); //Checks reference
        System.out.println(s1.equals(s2));  //Checks content

        String s3 = "Jordan";
        String s4 = "Jordan";

        System.out.println(s3==s4); //Checks reference
        System.out.println(s3.equals(s4));  //Also Checks reference
    }
}
