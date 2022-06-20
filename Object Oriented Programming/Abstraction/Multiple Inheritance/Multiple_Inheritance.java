//MULTIPLE INHERITANCE USING INTERFACE
/*
 * Multiple inheritance in java is possible through "interface" not through "class"
 * In Interface we don't actually define the method, we just declare
 * So, a subclass that actually implements the interface can define the abstract method
 * So, there is no ambiguity as the definition is only one i.e in the subclass
 */

interface Developer{
    void print();
}

interface Footballer{
    void print();
}

class Allrounder implements Developer, Footballer{

    //abstract method defined

    public void print(){
        System.out.println("I code and play");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {

        Developer d = new Allrounder();

        d.print();

        Footballer f = new Allrounder();

        f.print();

    }
}
