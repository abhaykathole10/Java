/*
 * Abstarction is hiding essesntial information and showing just the functionality
 * Abstarction is possible in two ways 1.Abstarct class(0-100%) 2.Interfaces(100%)
 * Class with atleast one abstract method(without body) is called abstract class
 * Abstract class can also have non-abstract methods(with body)
 * Abstract class cannot be instantiated i.e no objects of abstract class
 * It can have constructors and static methods also.
 * It can have final methods which will force the subclass not to change the body of the method.
 * Abstract class having constructor, data member and methods
 * If you are extending an abstract class that has an abstract method, you must either provide
   the implementation of the method or make this class abstract.
 */

abstract class Animal{

    Animal(){
        System.out.println("Animal Constructor");
    }

    //Regular methods are also present in abstract class
    public void sleep(){
        System.out.println("Animal Sleep");
    }

    //Abstract method do not have body i.e no {..}
    abstract void color();
}

class Dog extends Animal{

    //Abstract method is Defined
    public void color(){
        System.out.println("Dog Color");
    }
}

class Cat extends Animal{

    //Abstract method is Defined
    public void color(){
        System.out.println("Cat Color");
    }
}

public class Abstract_1 {
    public static void main(String[] args) {
        //Animal a = new Animal();

        //Creating reference of Animal
        Animal a;

        //Referring to Dog
        a = new Dog();
        a.sleep();
        a.color();

        //Referring to Cat
        a = new Cat();
        a.sleep();
        a.color();

    }
}
/*
    Animal Constructor
    Animal Sleep
    Dog Color
    Animal Constructor
    Animal Sleep
    Cat Color
 */