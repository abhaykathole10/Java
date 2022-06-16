class Student{
    int roll;
    String name;

    //These are the default value for the variables as the object of "Student" class is created
    Student(){
        this.roll = 000;
        this.name = "None";
    }

    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    void display(){
        System.out.println("Roll no: " + roll + " Name: " + name);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student(123, "Stuart Broad");

        a.display();
        b.display();
    }
}



