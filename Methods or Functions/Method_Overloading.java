public class Method_Overloading {

    //Method overloading means we can use same function name to get different outputs

    //Here the inputs are in "integer" and is returning a "integer"
    public static int add(int x, int y){
        return x + y;
    }

    //Here the inputs are in "double" and is returning a "double"
    public static double add(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int a, b;
        double c, d;
        a = 10; b = 20; c = 2.3d; d = 4.5d;

        //Depending on the inputs the respective function will be called
        System.out.println(add(a, b));
        System.out.println(add(c, d));
    }
}
