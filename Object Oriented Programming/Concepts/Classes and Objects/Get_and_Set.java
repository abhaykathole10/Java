//GETTER AND SETTER METHOD IN JAVA

class Employee{
    int id;
    String name;
    float salary;

    //SETTER METHOD IN JAVA / ACCESSOR METHOD
    public void setData(int id, String name, float salary){

        //"this" tells the current instance i.e the current object
        //If we using the same name for the 'arguments' and the 'parameters' of SET, we have to use "this"
        //If the names are not same ex. setData(int x, String y, float z), then no need of "this"
        //We can directly say id = x; name = y; salary = z; But using "this" is a good practise

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //GETTER METHOD IN JAVA / MUTATOR METHOD
    public void getData(){
        System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary);
    }
}

public class Get_and_Set {
    public static void main(String[] args) {

        //Instantiating an object of class "Employee"
        Employee teacher = new Employee();

        //Declaring each variable
        teacher.id = 23;
        teacher.name = "Issac Newton";
        teacher.salary = 35000;

        //Instantiating an object of class "Employee"
        Employee manager = new Employee();

        //declaring using a setData function
        manager.setData(32, "Sunder Pichai", 48500);

        //Printing/ Getting the data
        teacher.getData();
        manager.getData();
    }
}
