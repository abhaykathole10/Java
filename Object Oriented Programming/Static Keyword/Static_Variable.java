class Counter{
    static int count = 0;

    //Constructor gets invoked as soon a object is created
    Counter(){
        count++;
    }

    public void showCount(){
        System.out.println("Counter: " + count);
    }
}

public class Static_Variable {
    public static void main(String[] args){

        //Invoking CONSTRUCTOR 1st time
        Counter a = new Counter();

        a.showCount();  //count = 1

        //Invoking CONSTRUCTOR 2nd time
        Counter b = new Counter();

        b.showCount();  //count = 2

        //Invoking CONSTRUCTOR 3rd time
        Counter c = new Counter();

        c.showCount();  //count = 3

    }
}
/*
 * If normal "int" then o/p 1 1 1
 * But we are sharing same count variable with all the objects
 * Therefore, o/p 1 2 3
 */