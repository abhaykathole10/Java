class Employee{
    int id;
    String name;

        public void getInfo(){
            System.out.println("Welcome " + name + " your ID is " + id);
        }
}

public class Class_Object{
    public static void main(String[] args) {

        //Creating objects of class "Employee"
        Employee First = new Employee();
        Employee Second = new Employee();

        //Assigning the "id" parameter for both objects
        First.id = 11;
        Second.id = 21;

        //The class member variables can be accessed directly i.e they are public
        System.out.println(First.id);

        //Assigning the "name" variable for both the objects
        First.name = "Abhay Kathole";
        Second.name = "Rushikesh Giri";

        //Accessing the member function of the class "Employee"
        First.getInfo();
        Second.getInfo();

    }
}