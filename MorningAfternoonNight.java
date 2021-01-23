import java.util.Scanner;

public class MorningAfternoonNight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What hour of the day is it?");
		int dayHour = input.nextInt();
		
		while (dayHour < 1 || dayHour > 24) {
			System.out.println("What hour of the day is it?");
			dayHour = input.nextInt();
		}
		
		if (dayHour >= 6 && dayHour < 12){
			System.out.println("It is the morning!");
		}
		if (dayHour >=12 && dayHour < 18) {
			System.out.println("It is the afternoon!");
		}
		if (dayHour >= 18 || dayHour < 6){
			System.out.println("It is the Night!");
		}
	}
}