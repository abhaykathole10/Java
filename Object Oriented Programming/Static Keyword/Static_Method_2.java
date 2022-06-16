class Square{
    static int func(int x){
        return x*x;
    }
}

public class Static_Method_2 {
    public static void main(String[] args) {

        //Directly calling a static method by mentioning the class name "." and function name
        int res = Square.func(5);

        System.out.println(res);
    }
}
