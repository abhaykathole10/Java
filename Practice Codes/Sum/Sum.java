public class Sum {
    public static void main(String[] args) {
        int x = 100, sum = 0;

//		Using for loop
//		for(int i=0; i<=x ; i++) {
//			sum = sum + i;
//		}

		//Using formula
		sum = (x*(x+1))/2;

		System.out.println("Sum of first " + x + " natural numbers is " + sum);
    }
}
