import java.util.Scanner;

public class Marks {
    public static void main(String args[]) {
        int marks;
        Scanner sc = new Scanner(System.in);

        marks = sc.nextInt();
        if(marks <40) {
            System.out.println("The candidate is failed");
        }
        else if(marks<50) {
            System.out.println("The candidate is passed in D grade");
        }
        else if(marks<60) {
            System.out.println("The candidate is passed in C grade");
        }
        else if(marks<70) {
            System.out.println("The candidate is passed in B grade");
        }
        else if(marks<80) {
            System.out.println("The candidate is passed in A grade");
        }
        else if(marks<90) {
            System.out.println("The candidate is passed in A+ grade");
        }
        else {
            System.out.println("The candidate is passed in S grade");
        }
    }
}
