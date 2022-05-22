import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel");
                break;
        }

    }
}
