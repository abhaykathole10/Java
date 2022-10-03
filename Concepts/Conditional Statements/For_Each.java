public class For_Each {
    public static void main(String[] args) {
        //Declaring an "Array" of Strings
        String arr[] = {"Cow", "Goat", "Horse", "Ox", "Buffallo"};

        //Creating a string iterator to iterate through array 'arr'
        for (String itr : arr) {
            System.out.println(itr);
        }
    }
}
