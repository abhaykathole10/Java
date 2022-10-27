public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
		int remainder, reverse = 0, p;
		p = x;

		while(x != 0) {
			remainder = x%10;
			reverse = reverse*10 + remainder;
			x = x/10;
		}

		if(p == reverse) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not a palindrome");
		}
    }
}
