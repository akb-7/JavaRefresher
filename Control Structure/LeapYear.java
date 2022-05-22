import java.util.Scanner;

class LeapYear {
	int year;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int year = sc.nextInt();
		if( (year%4==0) && (year%100!=0) || (year%400==0) ) {
			System.out.println("The entered year is a leap year");
		}
		else {
			System.out.println("The entered year is not a leap year");
		}
	}

}