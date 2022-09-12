public class Example2 {
    public static void main(String[] args) {
        String s1 = new String("ab");
        String s2 = new String("ab");
        System.out.println(s1==s2); //false

        String s3 = "ab";
        String s4 = "ab";
        System.out.println(s3==s4); //true

        String s5 = "a" + "b";

        System.out.println(s4==s5); //true

        String s6 = "a";
        String s7 = s6 + "b";

        System.out.println(s4==s7); //false

        final String s8 = "a";
        String s9 = s8 + "b";

        System.out.println(s4==s9); //true
    }
}
