//COPY CONSTRUCTOR also CONSTRUCTOR OVERLOADING

class People{
    String name;
    int pin;

    //CONSTRUCTOR 1
    //Default constructor
    People(){}

    //CONSTRUCTOR 2
    //This Constructor accepts "String" and "int" parameters
    People(String name, int pin){
        this.name = name;
        this.pin = pin;
    }

    //CONSTRUCTOR 3
    //This constructor takes an 'object' as a parameter and sets it's variables values as it's own values
    People(People x){
        name = x.name;
        pin = x.pin;
    }

    public void display(){
        System.out.println("Name: " + name + " Pin: " + pin);
    }

}

public class Copy_Constructor {
    public static void main(String[] args) {

        //Creating an object and assigning value at the time of initialization
        //CONSTRUCTOR 1 will be instantiated

        People p = new People("Kamal Hasan" , 444604);

        //Creating another object and passing an object as an argument
        //CONSTRUCTOR 2 will be instantiated

        People q = new People(p);

        p.display();

        q.display();

        //We can also copy values of one object to other without using copy constructor

        //CONSTRUCTOR 3 will be instantiated

        People r = new People();

        r.name = q.name;
        r.pin = q.pin;

        r.display();

    }
}
