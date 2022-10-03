import java.util.Scanner;

public class Student_Results {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            //Getting the marks of each students
            System.out.print("Enter marks of sunject 1: ");
            float s1 = sc.nextInt();
            System.out.print("Enter marks of sunject 2: ");
            float s2 = sc.nextInt();
            System.out.print("Enter marks of sunject 3: ");
            float s3 = sc.nextInt();
            System.out.print("Enter marks of sunject 4: ");
            float s4 = sc.nextInt();
            System.out.print("Enter marks of sunject 5: ");
            float s5 = sc.nextInt();

            //Getting the total marks scored by all the students and dividing by total marks
            float percent = (s1+s2+s3+s4+s5)*100/500;

            //Printing the result in "percentage"
            System.out.println("Percentage: " + percent);
        }
    }
}
/*
We have to define s1, s2, s3 .... float type beacuse if they are integer then the result of
percent will also be integre no matter what type percent is it will always show integer value.
INTEGER VARIABLES EVALUATE TO INTEGER VALUE ONLY
 */