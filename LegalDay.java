import java.util.Scanner;

public class LegalDay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the year you want to check?");
		int year = input.nextInt();
		System.out.println("What is the month you want to check?");
		int month = input.nextInt();
		System.out.println("What is the day you want to check?");
		int day = input.nextInt();
		Boolean leapYear = false;
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			leapYear = true;
		}
		
		if (month < 1 || month > 12) {
			System.out.println("No that date is not legal");
		}
		
		else if (month == 2) {
			if (day < 29 && day > 0) {
				System.out.println("Yes that date is legal");
			}
			else {
				System.out.println("No that date is not legal");
			}
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 31 && day > 0) {
				System.out.println("Yes that date is legal");
			}
			else {
				System.out.println("No that date is not legal");
			}
		}
		
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 31 && day > 0) {
				System.out.println("Yes that date is legal");
			}
			else {
				System.out.println("No that date is not legal");
			}
		}
	}
}