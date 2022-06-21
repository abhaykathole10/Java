public class Exception_handling {

    static void divFunc(int a, int b){
        try{
            //Throws an exception
            int res =  a / b;
            System.out.println("Division is "+ res);
        }
        catch (ArithmeticException e) {
            //Handles exceptions of type 'ArithmeticException'
            System.out.println("Caught in divFunc()");
        }
        finally{
            //Runs anyway
            System.out.println("Function complete");
        }
    }

    public static void main(String[] args) {

        divFunc(10, 2);

        //Here we will get Arithmetic error and the program will terminate abruptly
        //But we need to handle it to stop it's abrupt termination
        //That's why we get our customixzed error
        divFunc(10, 0);

    }
}
