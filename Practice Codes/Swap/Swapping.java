public class Swapping {
    public static void swap(int x, int y) {
		int t = x;
		x = y;
		y = t;
		System.out.println("a is " + x + " b is " + y);
	}
    public static void main(String[] args) {
        int a = 10, b = 20;
		System.out.println("a is " + a + " b is " + b);

		//Swapping x = new Swapping();

		swap(a, b);
    }
}
