public class PrimeNUm {
    public static void main(String[] args) {
        int a = 1, flag=0;

        if(a == 0){
            System.out.println("Invalid");
        }
        if(a == 1){
            System.out.println("Niether prime nor composite");
        }
        if(a > 1){
            for(int i=2; i<a/2; i++){
                if(a % i == 0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println("Not Prime");
        }
        else
            System.out.println("Prime");
    }
}
