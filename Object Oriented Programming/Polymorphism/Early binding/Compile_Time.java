//POLYMORPHISM | Compile Time Polymorphism | Staic / Early Binding | Method / Operator Overloading

public class Compile_Time {

    //Add method that accepts 'integer' arguments
    public static int add(int a, int b){
        return(a+b);
    }

    //Add method that accepts 'double' arguments
    public static double add(double x, double y){
         return(x+y);
    }

    public static void main(String[] args) {

        //Compiler calls the first method
        System.out.println(add(3,5));

        //Compiler calls the second overloaded method
        System.out.println(add(4.5,6.8));
    }

}
/*
 * Which method to call is decided by the compiler at the compile time
 * As in method overloading the number and type of parameters differ, it's easy to recognize
 */