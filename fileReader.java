import java.util.Scanner;

import java.io.File;


class FileReader {

	private static String output;

	private static int id;

	private static String forename;

	private static String surname;

	private static int coursework1Mark;

	private static int coursework2Mark;

	private static int examMark;

	private static double finalMark;


	public static void main(String[] args) {

		File students = new File ("student_data.txt");

		Scanner studentData = new Scanner(students);

		while (output != ",  : ") {

			id = studentData.nextInt();

			forename = studentData.next();

			surname = studentData.next();

			coursework1Mark = studentData.nextInt();

			coursework2Mark = studentData.nextInt();

			examMark = studentData.nextInt();


			finalMark = ((coursework1Mark * 0.1) + (coursework2Mark * 0.1) + (finalMark * 0.8));

			try {

				output = String.format("%03d, %s %s: %.2f", id, forename, forename, finalMark);

				System.out.println(output);

			} catch (Exception e) {

				studentData.close();

				System.exit(0);

			}

		}

	}

}

