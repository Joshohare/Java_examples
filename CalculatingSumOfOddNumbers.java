import java.util.*;

public class CalculatingSumOfOddNumbers {
	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		for (i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				
			}
			else {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}