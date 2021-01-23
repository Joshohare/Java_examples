public class ArrayLocator {
	public static void main(String[] args) {
		int[] numbers = {1, 7, -3, 14, 19, 0, 2, -8, 6, 11, 3};
		int smallestValue = 0;
		int largestValue = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (smallestValue > numbers[i]) {
				smallestValue = numbers[i];
			}
			else if (largestValue < numbers[i]) {
				largestValue = numbers[i];
			}
		}
		System.out.println("The largest value is: " + largestValue);
		System.out.println("The smallest value is: " + smallestValue);
	}
}

