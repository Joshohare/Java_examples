import java.util.Scanner;

public class EuropeanCapitalsPopulations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the country you want to know about?");
		String country = input.nextLine();
		String fact = "Input does not match a country in our database!";
		
		switch (country.toLowerCase()) {
			case "poland":
			fact = "The capital of Poland is Warsaw and it has a population of 38,483,957";
			
			case "spain":
				fact = "The capital of Spain is Madrid and it has a population of 46,704,314";
			
			case "ireland":
				fact = "The capital of Ireland is Dublin and it has a population of 4,609,600";
			
			case "germany":
				fact = "The capital of Germany is Berlin and it has a population of 80,716,000";
				
		}
		System.out.println(fact);
	}
}