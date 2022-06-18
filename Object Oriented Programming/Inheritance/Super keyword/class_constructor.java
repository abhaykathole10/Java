/*
 * The child class automatically calls parent class constructor
 * As we used "super" keyword to call immediate parent method that was overridden by child
 * Here too, "super" is used, but implicitly by the compiler
 * Default constructor is provided by compiler if we haven't declared on our own
 * With that default constructor "super()" is also added automatically(1st) to call the parent constructor
 */

class Animal{

    //Parent constructor

    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Cat extends Animal{

    //Child constructor

    Cat(){

        //super(); called implicitly
        System.out.println("Cat Constructor");
    }
}

public class class_constructor {
    public static void main(String[] args) {

        //Creating parent object so parent constructor will be called implicitly
        Animal a = new Animal();

        //Creating child object so chil constructor will be called implicitly along with parent(1st)
        Cat b =  new Cat();

        System.out.println(a.getClass());
        System.out.println(b.getClass());

    }
}

/*
Animal Constructor
Animal Constructor
Cat Constructor
 */