class Football{
    public void fMethod(){
        System.out.println("I play Football");
    }
}
class Developer{
    public void dMethod(){
        System.out.println("I develop Applications");
    }
}

//class Human extends Football,Developer{}

class Player extends Football{
    public void pMethod(){
        System.out.println("I am an Athlete");
    }
}

class Geek extends Developer{
    public void gMethod(){
        System.out.println("I am a Coder");
    }
}

/*
class Allrounder extends Football,Developer{
    (ERROR)- Multiple Inheritance is not supported through class
}
*/

public class example {
    public static void main(String[] args) {

        Player a = new Player();

        Geek b = new Geek();

        a.fMethod();
        a.pMethod();

        b.dMethod();
        b.gMethod();

    }
}
