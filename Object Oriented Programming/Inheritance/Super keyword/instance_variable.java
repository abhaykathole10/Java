/*
SUPER is used to refer immediate parent class "instance variable"

Comman property/ attribute is shared among all the classes
But the property defined for current class will be shown while execution by default
We we want to access the immediate parent property then we use "super" keyword
*/

class Animal{

    //Animal's color property/ attribute

    String color = "Black";
}

//"Cow" inherits from "Animal" it's immediate is "Animal"

class Cow extends Animal{

    //Cow's color property/ attribute

    String color = "White";

    public void cMethod(){
        System.out.println("Cow's color: " + color);
    }

    public void caMethod(){

        //"super" keyword to access immediate parent

        System.out.println("Immediate Animal's color: " + super.color);
    }
}

//"Calf" inherits from "Cow" it's immediate is "Cow"

class Calf extends Cow{

    //Calf's color property/ attribute

    String color = "Brown";

    public void fMethod(){
        System.out.println("Calf's color: " + color);
    }

    public void fcMethod(){

        //"super" keyword to access immediate parent

        System.out.println("Immediate Animal's color: " + super.color);
    }
}

public class instance_variable {
    public static void main(String[] args) {

        Cow a = new Cow();

        //Calling "Cow" class's method
        a.cMethod();
        a.caMethod();

        Calf b = new Calf();

        //Calling "Calf" class's method
        b.fMethod();
        b.fcMethod();
    }
}

/*
Cow's color: White
Immediate Animal's color: Black
Calf's color: Brown
Immediate Animal's color: White
 */