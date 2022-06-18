class Student{

    //If "private" then getData() of Engineer cannot use these attributes
    protected int roll;
    protected String name;

    Student(int roll, String name){

        //Assigning the argument values to the current object attributes
        this.roll = roll;
        this.name = name;
    }

    //Displaying two attributes of Student
    public void getData(){
        System.out.format("%s is having roll no %d\n", name, roll);
    }
}

class Engineer extends Student{
    String branch;

    Engineer(int roll, String name, String branch){

        //super() will call the parent class constructor
        super(roll, name);

        //We are defining the new parameter that we indroduced in this class "branch"
        this.branch = branch;
    }

    //Displaying 3 attributes of Engineer
    public void getData(){
        System.out.format("%s is having roll no %d and branch %s\n", name, roll, branch);
    }
}

public class Real_Use {
    public static void main(String[] args) {

        Student a = new Student(101, "Abhay");
        Student b = new Student(105, "Dikshant");

        //a.roll = 999; if not private we can de this

        a.getData();
        b.getData();

        Engineer c = new Engineer(121, "Rushikesh", "Mechanical");

        c.getData();

    }
}
