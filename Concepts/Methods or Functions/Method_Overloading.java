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

    //Here the inputs are in "integer" and "double" and is returning a "double"
    public static double add(int x, double y, double z){
        return x + y + z;
    }

    public static void main(String[] args) {
        int a, b;
        double c, d;
        a = 10; b = 20; c = 2.3d; d = 4.5d;

        //Depending on the inputs the respective function will be called
        System.out.println(add(a, b));
        System.out.println(add(c, d));
        System.out.println(add(a, c, d));
    }
}
//Multiple methods can have the same name as long as the number and/or
//type of parameters are different.