public class Type_Casting {
    public static void main(String[] args) {
        //Widening casting(automatic) SMALLER TO LARGER type
        int i = 5;
        double d = i;

        //INT to DOUBLE
        System.out.println(d);

        //Narrowing casting(manually) LARGER TO SMALLER type
        float f = 4.77f;

        //we are manually placing keyword "short" to convert float to short
        short s = (short)f;

        //INT to DOUBLE
        System.out.println(s);

    }
}
