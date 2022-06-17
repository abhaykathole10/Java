//INHERITANCE(extends) | CONSTRUCTOR OVERLOADING | SUPER KEYWORD

//'Parent' class (on it's own)
class Parent{

    //CONSTRUCTOR 1 - With no parameters
    public Parent(){
        System.out.println("Parent class with no parameters");
    }

    //CONSTRUCTOR 2 - With one parameter
    public Parent(int x){
        System.out.println("Parent class with \"int x\"" );
    }

    //CONSTRUCTOR 3 - With two parameter
    public Parent(int x, int y){
        System.out.println("Parent class with \"int x\" and \"int y\"" );

    }
}

//'Child' class that inherites from 'Parent' class with the help of "extends" keyword
class Child extends Parent{

    //CONSTRUCTOR 1 - With no parameter
    public Child(){

        //SUPER KEYWORD WITH LIST OF VARIABLES
        //Calls the "super class" constructor with two parameters
        super(5,10);

        System.out.println("Child class contructor with no parameter");

    }

    //CONSTRUCTOR 2 - With one parameter
    public Child(int p){

        //SUPER KEYWORD WITH LIST OF VARIABLES
        //Calls the  "super class" constructor with one parameters
        super(15);

        System.out.println("Child class constructor with \"int p\"");
    }
}

public class Super_Keyword {
    public static void main(String[] args) {

        //Creating an object with no arguments i.e the conctructor with no arguments will be invoked
        Child a = new Child();

        //Creating an object with no arguments i.e the conctructor with no arguments will be invoked
        Child b = new Child(33);

        System.out.println(a.getClass());

        System.out.println(b.getClass());
    }
}
/*
 * If you don't have child class connstructor it will automatically invoke Parent class constructor
 * If both of them have constructor then Parent class constructor will invoke first
 * In case of overloaded parent constructor, which constructor would the child object invoke?
 * Obviously it will invoke constructor with no arguments first, but what if we want to invoke the other one
 * Here, we use "super" keyword with the parameters list to specify which Parent constructor to invoke
 */