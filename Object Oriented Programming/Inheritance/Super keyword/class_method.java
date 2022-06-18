/*
SUPER is used to refer immediate parent class "method"

Comman "method" is shared among all the classes i.e the method is "Overridden"
But the method defined for current class will be shown while execution by default
We we want to access the immediate parent property then we use "super" keyword
*/

class Animal{

    //Animal's color method

    public void eat(){
        System.out.println("Animal eat Veggies and Meat");
    }
}

//"Cow" inherits from "Animal" it's immediate is "Animal"

class Cow extends Animal{

    //Cow's "eat()" method, ovverrides Animal's "eat()" method

    public void eat(){
        System.out.println("Cow eat only Vegeterian food");
    }

    public void cMethod(){

        System.out.print("Immediate Animal's food: ");

        //"super" keyword to access immediate parent's "eat()" method

        super.eat();
    }
}

//"Calf" inherits from "Cow" it's immediate is "Cow"

class Calf extends Cow{

    //Calf's "eat()" method, ovverrides Cow's "eat()" method

    public void eat(){
        System.out.println("Calf only drinks Milk");
    }

    public void fMethod(){

        System.out.print("Immediate Animal's food: ");

        //"super" keyword to access immediate parent's "eat()" method

        super.eat();
    }
}
public class class_method {
    public static void main(String[] args) {

        Cow a = new Cow();

        a.eat();
        a.cMethod();

        Calf b = new Calf();

        b.eat();
        b.fMethod();
    }
}

/*
Cow eat only Vegeterian food
Immediate Animal's food: Animal eat Veggies and Meat
Calf only drinks Milk
Immediate Animal's food: Cow eat only Vegeterian food
 */