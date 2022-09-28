public class Multi_dimensional {
    public static void main(String[] args) {
        //Array of 1-d arrays is a 2-d array
        int[][] arr = {{11,22,33},{99,88,77}};

        for(int i=0; i<arr.length; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
