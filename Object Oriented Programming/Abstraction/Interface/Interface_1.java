package Interface;


/*
 * Interface only allows abstract methods without body and variables
 * It should have IS-A Relationship i.e Inheritence
 * It cannot be instantiated, i.e object cannot be created
 * "Multiple Inheritance" is possible through "Interface" but not "Class"
 * It can be used to achieve "loose coupling".
 * The Java compiler adds public and abstract keywords before the interface method.
 * Moreover, it adds public, static and final keywords before data members.
 * Since Java 8, Interface can have 'default' and 'static' methods also.
 */

interface A{

    int var = 20;   //compiler: public static final int var = 20;

    //All methods should be declared as abstract in Interface
    //Even if we don't provide "abstract" keyword it gets automatically added

    void eat();     //compiler: public abstract void eat()
    void sleep();   //compiler: public abstract void sleep()
}
class B implements A{

    public void eat(){
        System.out.println("Animal B Eating");
    }

    public void sleep(){
        System.out.println("Animal B Sleeping");
    }
}

public class Interface_1 {
    public static void main(String[] args) {

        A a = new B();
        a.eat();
        a.sleep();
    }
}
