//This program will ask the user questions and give relevant responses

import java.util.Scanner;

public class HelloYou {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//This input asks for the user's name and then replies by saying hello and then the user's name
		
		System.out.println("What is your name?");
		String user = input.nextLine();
		System.out.println("Hello " + user + "!");
		
		//This input asks for the user's favorite fruit and then replies by saying they love that fruit too
		
		System.out.println("What is your favorite fruit?");
		String fruit = input.nextLine();
		System.out.println("I love " + fruit + " too!");
		
		}
}