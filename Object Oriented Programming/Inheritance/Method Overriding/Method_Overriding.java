class A{

    //"func1" of class "A"
    public void func1(){
        System.out.println("func1 of class A");
    }

    //"func2" of class "A"
    public void func2(){
        System.out.println("func2 of class A");
    }

}

class B extends A{

    //METHOD OVERRIDING

    //"func1" is already defined in class "A", but we have overwrite it in class "B"
    //Now "func1" has it's own definition in class "B"

    ////"func1" of class "B"
    public void func1(){
        System.out.println("func1 of class B");
    }

}

public class Method_Overriding {
    public static void main(String[] args) {

        A a = new A();

        a.func1();
        a.func2();

        B b = new B();

        b.func1();  //It will not derive "func1" from clas "A" because it has it's own "func1"
        b.func2();  //It will derive "func2" from class "A"

    }
}

/*
    func1 of class A
    func2 of class A
    func1 of class B
    func2 of class A
 */


// Function name and parameter list should match if the function is called to be overerided
