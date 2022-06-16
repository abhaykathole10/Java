class Employee{
    int id;
    String name;
    float salary;

    public void setData(int x, String y, float z){
        id = x;
        name = y;
        salary = z;
    }

    public void getData(){
        System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary);
    }
}

public class Class_Employee {
    public static void main(String[] args) {

        //Instantiating an object of class "Employee"
        Employee teacher = new Employee();

        //Declaring each variable
        teacher.id = 23;
        teacher.name = "Skukla Sir";
        teacher.salary = 35000;

        //Instantiating an object of class "Employee"
        Employee manager = new Employee();

        //declaring using a setData function
        manager.setData(32, "Mr. Shyam", 48500);

        //Printing/ Getting the data
        teacher.getData();
        manager.getData();
    }
}
