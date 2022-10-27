import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        while(true) {
			try (Scanner sc = new Scanner(System.in)) {
                System.out.print("\nEnter number: ");
                int num = sc.nextInt();

                ArrayList<Integer> b = new ArrayList<Integer>();

                while(num > 0) {
                	int x = num % 2;
                	b.add(x);
                	num = num/2;
                }

                ListIterator<Integer> itr = b.listIterator(b.size());

                while(itr.hasPrevious()) {
                	System.out.print(itr.previous().toString() + " ");
                }

                int count = 0, maxCount = 0;
                Boolean flag = false;

                for(int i=0; i<b.size(); i++) {
                	if(b.get(i) == 1) {
                		if(flag) {
                			if(count > maxCount) {
                				maxCount = count;
                			}
                		}
                		count = 0;
                		flag = true;
                	}
                	if(b.get(i) == 0) {
                		count++;
                	}

                }
                System.out.println("\n" + maxCount);
            }

        }
    }
}
