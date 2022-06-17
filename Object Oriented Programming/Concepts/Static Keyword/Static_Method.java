class Method{
    int id;
    String name;
    static String college = "VIIT";

    //Static methods have access only to static members, they can change it too
    static void cMethod(){
        college = "PCCOE";
    }

    void showMethod(){
        System.out.println("The college is " + college);
    }
}

public class Static_Method {
    public static void main(String[] args) {

        //We acn call static methods without creating objects
        Method.cMethod();

        Method a = new Method();

        a.showMethod();

    }
}
