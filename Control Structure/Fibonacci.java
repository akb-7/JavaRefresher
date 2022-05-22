import java.util.Scanner;

public class Fibonacci {
    // this class is used to print the fibonacci number in O(n). time complexity

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int first = 1,second = 1;
        for(int i=1;i<=n;i++) {
            if(i==1){
                System.out.print(first+"\t");
            }
            else if(i==2) {
                System.out.print(second+"\t");
            }
            else {
                int third = first+second;
                System.out.print(third+"\t");
                first = second;
                second = third;
            }
        }
    }
}
