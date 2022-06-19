package instanceOf;

interface Animal{}

class Dog implements Animal{
    public void dMethod(){
        System.out.println("Dog method");
    }
}

class Cat implements Animal{
    public void cMethod(){
        System.out.println("Cat method");
    }
}

class Call{
    public void invoke(Animal p){
        if(p instanceof Cat){
            Cat x = (Cat)p;     //Downcasting
            x.cMethod();
        }

        if(p instanceof Dog){
            Dog y = (Dog)p;     //Downcasting
            y.dMethod();
        }
    }
}

public class example {
    public static void main(String[] args) {

        Animal a = new Cat();

        Call b = new Call();

        b.invoke(a);

    }
}
