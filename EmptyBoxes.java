import java.util.*;

public class EmptyBoxes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How wide do you want your square to be?");
		int width = in.nextInt();
		System.out.println("How high do you want your square to be?");
		int height = in.nextInt();
		String temp = "";
		int j = 0;
		int i = 0;
		for (i=0; i<height; i++) {
			if (i==0||i==height-1) {
				temp = "";
				for (j=0; j<width; j++) {
				temp = (temp + "*");
				}
			}
			else {
				temp = "";
				for (j=0; j<width; j++) {
					if (j == 0 || j == width-1) {
						temp = (temp + "*");
					}
					else {
						temp = (temp + " ");
					}
				}
			}
			System.out.println(temp);
		}
	}
}