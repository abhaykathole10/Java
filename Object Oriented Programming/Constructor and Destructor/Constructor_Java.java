class MyClass{
    int myVar1;
    String myVar2;

    public void display(){
        System.out.println("myVar1: " + myVar1 + " myVar2: " + myVar2);
    }

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass();
        myObj1.display();
    }
}

