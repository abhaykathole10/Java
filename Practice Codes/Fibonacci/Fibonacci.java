public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, c, n=20;

		for(int i = 2; i <= n; i++) {

			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}
    }
}
