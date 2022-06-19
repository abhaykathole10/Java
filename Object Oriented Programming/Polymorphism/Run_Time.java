//POLYMORPHISM | Run Time Polymorphism | Dynamic / Late binding | Method Overriding

class Animal{
    public void sound(){
        System.out.println("Animal Sound");
    };
    public void sleep(){
        System.out.println("Animals Sleep");
    }
}

class Cow extends Animal{
    public void sound(){
        System.out.println("Cow: Haammbaaaaa");
    }
    public void eat(){
        System.out.println("Cow is eating");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat: Meow Meow");
    }
    public void drink(){
        System.out.println("Cat drinks Milk");
    }
}


public class Run_Time {
    public static void main(String[] args) {

        Cow cow = new Cow();

        cow.sound();
        cow.eat();
        cow.sleep();
        //cow.drink();  drink() belongs to "Cat" - No relation

        Cat cat = new Cat();

        cat.sound();
        cat.drink();
        cat.sleep();
        //cat.eat();    eat() belongs to "Cow" - No relation


    //REFERENCE OF "ANIMAL" REFERRING TO OBJECT OF "ANIMAL"

        Animal ani = new Animal();

        ani.sound();
        ani.sleep();
        //ani.eat();     eat() belongs to "Cow" i.e subclass
        //ani.drink();   drink() belongs to "Cat" i.e subclass

        //"ani" cannot access the overriden methods of it's subclass that are redefined accordingly


    //REFERNECE OF "ANIMAL" REFERING TO OBJECT OF "COW"

        Animal a = new Cow();   //Upcasting
        a.sound();

        //a.eat() is impossible because the Parent reference can refer to only overridden methods

        Animal b = new Cat();
        b.sound();

        //b.drink() is impossible because the Parent reference can refer to only overridden methods
    }
}

/*
 * In case of OVERRIDING the name of the funtion, type and number of parameters should be same
 * This process is slow but flexible
 */