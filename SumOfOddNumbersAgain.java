import java.util.*;

public class SumOfOddNumbersAgain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number you wish to use: ");
		int oddMaxTotal = in.nextInt();
		while (oddMaxTotal % 2 == 0) {
			System.out.print("Enter the number you wish to use: ");
		oddMaxTotal = in.nextInt();
		}
		int i = 0;
		int total = 0;
		for (i = 0; i < oddMaxTotal + 1; i++) {
			if (i % 2 == 0) {
				
			}
			else {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}