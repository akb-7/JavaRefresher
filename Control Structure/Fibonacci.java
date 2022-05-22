import java.util.Scanner;

public class Fibonacci {
    // this class is used to print the fibonacci number in O(n). time complexity

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int first = 1,second = 1;
        if(n==1){
            System.out.print(first+"\t");
        }
        else if(n==2) {
            System.out.print(second+"\t");
        }
        else {
            System.out.print(first+"\t");
            System.out.print(second+"\t");
            for(int i=3;i<=n;i++) {
                int third = first+second;
                System.out.print(third+"\t");
                first = second;
                second = third;
            }
        }
    }
}
