import java.util.Scanner;
class IfElse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>5) {
            System.out.println("The entered number is greater than 5");
        }
        else {
            System.out.println("The entered number is lesser than or equal to 5");
        }
    }
}