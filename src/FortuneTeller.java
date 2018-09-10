import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Riley Patrick
		// gathering data part 1
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = input.nextLine();
		closeApplication(firstName);
		System.out.println("Please enter your last name: ");
		String lastName = input.nextLine();
		closeApplication(lastName);
		System.out.println("Please enter your age: ");
		String ageString = input.nextLine();
		closeApplication(ageString);
		int age;
		try {
			age = Integer.parseInt(ageString);
		} catch (NumberFormatException ex) {
			age = 100;
			System.out.println("Boo you suck at typing. You're 100... I guess...");
		}
		// System.out.println(firstName + lastName + age);
		System.out.println("Please enter you birth month as a number: ");
		String birthMonthString = input.nextLine();

		closeApplication(birthMonthString);
		int birthMonth;
		try {
			birthMonth = Integer.parseInt(birthMonthString);
		} catch (NumberFormatException ex) {
			birthMonth = 1;
			System.out.println("Oh we got a wise guy. You're birthday is January now.");
		}

		System.out.println("Please enter your favorite ROYGBIV color. Type help if you don't know ROYGBIV colors: ");
		String favoriteColor = input.nextLine();
		while (favoriteColor.toLowerCase().equals("help")) {
			System.out.println(
					"The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet. Enter your favorite ROYGBIV color: ");
			favoriteColor = input.nextLine();
		}
		closeApplication(ageString);

		System.out.println("Please enter your number of siblings: ");
		String siblingsString = input.nextLine();
		closeApplication(siblingsString);
		int siblings;
		try {
			siblings = Integer.parseInt(siblingsString);
		} catch (NumberFormatException ex) {
			siblings = 0;
			System.out.println("You're no fun! So you get no siblings!");
		}

		// assigning the data to conditions part 2
		int retirmentYears = 0;
		if (age % 2 == 0) {
			retirmentYears = 800;
		} else {
			retirmentYears = 400;
		}

		String vacationHome = "";
		if (siblings == 0) {
			vacationHome = "Copenhagen, Denmark";
		} else if (siblings == 1) {
			vacationHome = "Amsterdamn, Netherlands";
		} else if (siblings == 2) {
			vacationHome = "Gent, Belgium";
		} else if (siblings == 3) {
			vacationHome = "Berlin, Germany";
		} else if (siblings > 3) {
			vacationHome = "Seoul, South Korea";
		} else if (siblings < 0) {
			vacationHome = "a cardboard box";
		}

		String transportationMode = "";

		switch (favoriteColor.toLowerCase()) {
		case "red":
			transportationMode = "Dragon";
			break;
		case "orange":
			transportationMode = "Chimera";
			break;
		case "yellow":
			transportationMode = "Phoenix";
			break;
		case "green":
			transportationMode = "Centar";
			break;
		case "blue":
			transportationMode = "Hippocampus";
			break;
		case "indigo":
			transportationMode = "Unicorn";
			break;
		case "violet":
			transportationMode = "Pegasus";
			break;
		default:
			transportationMode = "You didn't pick a ROYGBIV color";
		}

		double userBalance = 00.00;
		if (birthMonth >= 1 && birthMonth <= 4) {
			userBalance = 12.00;
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			userBalance = 500.23;
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			userBalance = 123.45;
		} else {
			userBalance = 0.00;
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retirmentYears + " years with $"
				+ userBalance + " in the bank, a vacation home in " + vacationHome + ", and travel by "
				+ transportationMode + ".");

		input.close();
	}

	static void closeApplication(String quitTest) {
		if (quitTest.equalsIgnoreCase("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
	}
}
