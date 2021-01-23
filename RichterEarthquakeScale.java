import java.util.Scanner;

public class RichterEarthquakeScale {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What level on the Richter Scale is it?");
		Double level = input.nextDouble();
		
		while (level < 0) {
			System.out.println("What level on the Richter Scale is it?");
			level = input.nextDouble();
		}
		
		if (level <= 1.9){
			System.out.println("Micro-earthquakes, not felt, or felt rarely.");
		}
		else if (level >= 2.0 && level <= 2.9) {
			System.out.println("Felt slightly by some people. No damage to buildings.");
		}
		else if (level >= 3.0 && level <= 3.9){
			System.out.println("Often felt by people, but very rarely causes damage.");
		}
		else if (level >= 4.0 && level <= 4.9) {
			System.out.println("Noticeable shaking of indoor objects and rattling noises. Felt by most people in the affected area. Slightly felt outside.");
		}
	}
}