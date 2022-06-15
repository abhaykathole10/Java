public class Method_Java {

    //Static functions means the function belongs to "Method_Java" class but not the class object
    public static int add(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        int a, b, c, d;
        a = 10; b = 20; c = 23; d = 45;
        System.out.println(add(a, b));
        System.out.println(add(c, d));
    }
}
