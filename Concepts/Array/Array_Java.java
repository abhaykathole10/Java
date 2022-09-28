public class Array_Java {
    public static void main(String[] args) {

        int[] num = {2,4,6,3,1,8,7};

        //Traditional "for" loop to traverse through the array
        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }
        System.out.println("\n");

        //Altering the old elements
        num[0] = 11;
        num[1] = 22;
        num[3] = 33;

        //Using for each loop to traverse through the array
        for (int i : num) {
            System.out.println(i);
        }
    }
}
