public class Calculations {
    public static float add(float x, float y) {
		return x + y;
	}
	public static float sub(float x, float y) {
		return x - y;
	}
	public static float mul(float x, float y) {
		return x * y;
	}
	public static float div(float x, float y) {
		return x / y;
	}
    public static void main(String[] args) {
        float a = 100, b = 20;

		float l = add(a,b);
		float m = sub(a,b);
		float n = mul(a,b);
		float o = div(a,b);

		System.out.println("a = 100 & b = 20\n");
		System.out.println("a + b = " + l);
		System.out.println("a - b = " + m);
		System.out.println("a * b = " + n);
		System.out.println("a / b = " + o);

    }
}
