/*
 * "Throw" is used to throw manual exception
 * "Throws" tells the function what kind of exception it mught throw
 */

public class Throw_Throws {
    static void aFunc() throws NullPointerException{

        try {

            //Throws a manual exception
            throw new NullPointerException();
        }
        catch (NullPointerException e) {

            //Catches an exception of type "NullPointer"
            System.out.println("Caught in aFunc()");

            //Throws another exception of same type
            throw e;
        }
    }
    public static void main(String[] args) {

        try {

            //Gets an exception of type NullPointer from the catch of "aFunc"
            aFunc();
        }
        catch (NullPointerException e) {

            //Catches the exception thrown by above try
            System.out.println("Caught in Main()");
        }
    }
}
