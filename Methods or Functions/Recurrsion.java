public class Recurrsion {
    public static void main(String[] args) {
        int k = 5;
        System.out.println("The factorial of k is " + fact(k));
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
