import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int x;	//Declaring input variable
		while(true){	//this will run forever

			int i, flag=0, m=0;		//setting flag to 0

			System.out.print("Enter number: ");		//asking input

			try (Scanner sc = new Scanner(System.in)) {
                x = sc.nextInt();
            }
			m = x/2;	//we just want to iterate till halfway

			if(x==0 || x==1) {
				System.out.println("Not prime");
			}

			else {
				for(i = 2; i <= m; i++) {
					if(x % i == 0) {
						System.out.println("Not Prime");
						flag = 1;
						break;
					}
				}

				if(flag == 0) {
					System.out.println("Prime");
				}
			}
        }
    }
}
