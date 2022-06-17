class Student{
    int roll;
    String name;

    //These are the default value for the variables as the object of "Student" class is created
    Student(){
        this.roll = 000;
        this.name = "None";
    }

    void display(){
        System.out.println("Roll no: " + roll + " Name: " + name);
    }
}

public class Constructor_default {
    public static void main(String[] args) {

        //Creating an object of 'Student' class
        Student a = new Student();

        //Displaying the default values without assigning
        a.display();
    }
}
