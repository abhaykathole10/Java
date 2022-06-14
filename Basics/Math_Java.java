public class Math_Java {
    public static void main(String[] args) {
        int x, y, z, d;
        x = 10; y = 20; z = 64;
        d = x - y;

        //Getting the max and min of the two numbers
        System.out.println("The max element is " + Math.max(x,y));
        System.out.println("The min element is " + Math.min(x,y));

        //Square root of the number 'z'
        System.out.println("The Square root of 'z = 64' is " + Math.sqrt(z));

        //The subtraction of y from x
        System.out.println("The value of 'd = x-y' is " + d);

        //The absolute value gives the difference between two numbers
        System.out.println("The Absolute value of 'd = x-y' is " + Math.abs(d));

        //Math.random() generates a number between 0 and 1
        System.out.println("Some random value: " + (int)(Math.random()*101));
    }
}
