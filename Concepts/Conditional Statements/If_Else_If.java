public class If_Else_If {
    public static void main(String[] args) {
        int a = 27;
        if(a < 10){
            System.out.println("Smaller than 10");
        }else if(10 < a && a < 20){
            System.out.println("Between 10 and 20");
        }else{
            System.out.println("Above 20");
        }
    }
}
