//Java util is a package that contains Scanner class
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Creating an Object "sc" of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        //Using "nextLine()" method of the Scanner class through object "sc"
        //"nextLine()" is used to read the strings
        String name = sc.nextLine();

        System.out.print("Enter your age: ");

        //Using other method "nextInt()" of String class
        //"nextInt()" Reads a int value from the user
        int age = sc.nextInt();

        System.out.println("Hello! " + name + " you are " + age + " years old.");

    }
}
