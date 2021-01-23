import java.util.*;

public class WhileVsFor2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		while (count != 50) {
			System.out.print("Enter a number: ");
			count = in.nextInt();
			System.out.println(count);
		}
		System.out.println("Finished");
	}
}