import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides does this dice have? ");
		int sides = scan.nextInt();
		boolean rollAgain = true;
		while (rollAgain) {

			int firstRoll = (generateRandomDieRoll(sides));
			System.out.println(firstRoll);
			
			int secondRoll = (generateRandomDieRoll(sides));
			System.out.println(secondRoll);

			System.out.println(combos(firstRoll, secondRoll));

			System.out.println("Would you like to roll again? (y/n)");
			String roll = scan.next();
			
			rollAgain = keepRolling(roll);
		}
		System.out.println("Goodbye!");
		scan.close();
	}

	private static int generateRandomDieRoll(int numFace) {       //random number generator and integer converter

		double randomNumber = (Math.random() * numFace) + 1;
		int randomNumbo = (int) Math.round(randomNumber);          //convert double to int
		return randomNumbo;
	}

	private static String combos(int first, int second) {          //determine if the numbers are a special pair
		String combo = "";
		if (first + second == 2) {
			combo = ("SNAKE EYES!");
		} else if (first + second == 7) {
			combo = ("CRAPS!");
		} else if (first + second == 12) {
			combo = ("BOX CARS!");
		}
		return combo;
	}

	private static boolean keepRolling(String again) {             //decides to keep rolling or not
		boolean go = true;
		if (again.contains("y")) {
			go = true;
			return go;
		} else {
			go = false;
			return go;
		}
	}

}
