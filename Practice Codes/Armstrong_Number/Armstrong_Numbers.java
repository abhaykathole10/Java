public class Armstrong_Numbers {
    public static void main(String[] args) {
        int x = 1634;
		int p = x;
		double a,b=0;

		while(x != 0) {
			a = x%10;
			b = b + Math.pow(a,4);
			x = x/10;
		}
        if(p==b) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not");
		}
    }
}
