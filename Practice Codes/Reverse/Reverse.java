public class Reverse {
    public static void main(String[] args) {
        String s = "ABHAY", p = "";
		char ch;
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			p = ch + p;
		}
		System.out.println(p);
    }
}
