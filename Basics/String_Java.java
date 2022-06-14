public class String_Java {
    public static void main(String args[]) {
        String txt = "Abhay Kathole";
        System.out.println(txt);

        //String is not a primitive variable i.e its not in built
        //String is non primitive variable type i.e its user defined
        //String is an Object which has it's methods
        //There are different methods in String ex. length(), toLowreCase(), indexOf()


       System.out.println("Length of string is " + txt.length());
       System.out.println("toUpperCase() " + txt.toUpperCase());
       System.out.println("toLowerCase() " + txt.toLowerCase());
       System.out.println("indexOf('o') " + txt.indexOf('K'));
    }
}
