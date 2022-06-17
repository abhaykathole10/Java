import java.util.Scanner;

public class Recurrsion {

    public static void main(String[] args) {

        System.out.print("Enter number: ");

        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();

            System.out.println("The factorial of k is " + fact(k));
        }
    }

    public static int fact(int k){
        if(k == 0){
            return 1;
        }
        else{
            return k * fact(k-1);
        }
    }
}
