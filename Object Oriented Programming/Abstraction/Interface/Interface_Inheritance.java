package Interface;

/*
 * A interface can inherit from another interface
 * DEFAULT METHOD IN INTERFACE "defoult" keyword
 * STATIC METHOD IN INTERFACE "static" keyword
 * MARKER or TAGGED INTERFACE: Interface with no member,ex. Serializable, Cloneable, Remote, etc.
 * NESTED INTERFACE: We can have an interface inside an interface
 */

interface A{
    void walk();
}

interface B extends A{
    void run();
}

class C implements B{

    public void walk(){
        System.out.println("I am walking");
    }

    public void run(){
        System.out.println("I am running");
    }

}

public class Interface_Inheritance {
    public static void main(String[] args) {

        //Interface cannot be instantiated

        A p = new C();  //Upcasting

        p.walk();

        //p.run();  (Error)

        B q = new C();  //Upcasting

        q.run();

        q.walk();

        C r = new C();

        r.walk();

        r.run();
    }
}
