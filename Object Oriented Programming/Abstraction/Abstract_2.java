/*
 * You have to provide definitions for all the abstarct methods of abstract class in the inherited class.
 * If you are not providing definitions for all the methods, then the inherited class should also be "abstract"
 * If all the definitions are provided by the inherited class then it should just be "class" not "abstract class".
 */
abstract class A{

    abstract void aMethod();
    abstract void aaMethod();
    abstract void aaaMethod();
}

//Defining just the "aMethod()", so the classs becomes "abstract"
abstract class B extends A{

    public void aMethod(){
        System.out.println("aMethod()");
    }
}

//Defining all the remaining methods "aa()" and "aaa()" so no need of "abstract" keyword
class C extends B{

    public void aaMethod(){
        System.out.println("aaMethod()");
    }

    public void aaaMethod(){
        System.out.println("aaaMethod()");
    }
}

public class Abstract_2 {
    public static void main(String[] args) {

        //We can't create objects of "abstract" class
        //A a = new A();    -Cannot instantiate

        //Although, we can create reference of abstract class
        A a = new C();

        a.aMethod();
        a.aaMethod();
        a.aaaMethod();
    }
}
