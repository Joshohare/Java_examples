import java.util.*;

public class PersonNameAndAge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ages = new int[10];
		String[] names = new String[10];
		String nameEntered = "";
		int ageEntered = 0;
		int arrayPosition = 0;
		while (!nameEntered.equals("done") && arrayPosition !=10) {
			System.out.print("What is the name of the person?: ");
			nameEntered = in.next();
			if (!nameEntered.equals("done")) {
				System.out.print("What is the age of the person with the name " + nameEntered + "?: ");
				ageEntered = in.nextInt();
				names[arrayPosition] = nameEntered;
				ages[arrayPosition] = ageEntered;
				arrayPosition ++;
			}
		}
		
		int counter = 0;
		for (int i=0; i < names.length; i ++)
			if (names[i] != null)
				counter ++;
		
		for (int i=0; i < counter; i++) {
			System.out.print(names[i] + "	");
			System.out.println(ages[i]);
		}
		
		
		int youngest = ages[0];
		String youngestName = "";
		int oldest = 0;
		String oldestName = "";
		for (int i = 0; i < counter; i++) {
			if (youngest > ages[i]) {
				youngest = ages[i];
				youngestName = names[i];
			}
			else if (oldest < ages[i]) {
				oldest = ages[i];
				oldestName = names[i];
			}
		}
		System.out.println("The oldest person is: " + oldestName + "	" + oldest);
		System.out.println("The youngest person is: " + youngestName + "	" + youngest);
	}
}