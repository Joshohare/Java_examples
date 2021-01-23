import java.util.Scanner;
import java.lang.Math;

public class CalculateCarCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What did car 1 cost to buy?");
		double carCost1 = input.nextDouble();
		System.out.println("How much does it cost to service car 1?");
		double serviceCost1 = input.nextDouble();
		System.out.println("How far can car 1 travel before it needs to be serviced?");
		double serviceInterval1 = input.nextDouble();
		System.out.println("How many kilometers can car 1 travel per litre of fuel?");
		double kmPerLitre1 = input.nextDouble();
		System.out.println("How much does fuel cost per litre for car 1?");
		double fuelCostPerLitre1 = input.nextDouble();
		System.out.println("How far do you want to travel with your car?");
		double travelDistance = input.nextDouble();
		
		
		double numberOfServices1 = travelDistance / serviceInterval1;
		int numberOfServicesRound1 = (int) numberOfServices1;
		
		final String BPS = "\u00A3";
		
		double formula1 = carCost1 + (numberOfServicesRound1 * serviceCost1) +((travelDistance / kmPerLitre1) * fuelCostPerLitre1);
		
		
		
		System.out.println("What did car 2 cost to buy?");
		double carCost2 = input.nextDouble();
		System.out.println("How much does it cost to service car2?");
		double serviceCost2 = input.nextDouble();
		System.out.println("How far can car 2 travel before it needs to be serviced?");
		double serviceInterval2 = input.nextDouble();
		System.out.println("How many kilometers can car 2 travel per litre of fuel?");
		double kmPerLitre2 = input.nextDouble();
		System.out.println("How much does fuel cost per litre for car 2?");
		double fuelCostPerLitre2 = input.nextDouble();
		
		
		double numberOfServices2 = travelDistance / serviceInterval2;
		int numberOfServicesRound2 = (int) numberOfServices2;
		
		
		double formula2 = carCost2 + (numberOfServicesRound2 * serviceCost2) +((travelDistance / kmPerLitre2) * fuelCostPerLitre2);
		
		System.out.println("Car 1 will have an estimated cost of " + BPS + (String.format("%.2f", formula1)) + " over a distance of " + travelDistance);
		
		System.out.println(" ")
		
		System.out.println("Car 2 will have an estimated cost of " + BPS + (String.format("%.2f", formula2)) + " over a distance of " + travelDistance);
	}
}