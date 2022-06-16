class Student{
    int id;
    String name;

        //Constructor is defined that initiates as soon as the object is created
        //No need of first creating object and then calling setData() function
        //Set values right at the time of creating objects

        Student(int id, String name){
            this.id = id;
            this.name = name;
        }

        //display() method to  display data

        public void display(){
            System.out.println("ID: " + id + " Name: " + name);
        }
}

public class Parameterized{
    public static void main(String[] args) {

        //Creating objects of class "Employee"
        //At the same time passing arguments to the constructor
        //Construtor sets the value of private variables at the time of creation itself

        Student first = new Student(101, "Abhay Kathole");
        Student second = new Student(105, "Dikshant Daswat");

        first.display();
        second.display();
    }
}
