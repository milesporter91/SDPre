import java.util.Scanner;

public class Objective5Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userNum;

		System.out.println("Please enter a number: ");

		userNum = scanner.nextInt();
		if(userNum > 0) {
			System.out.println("The number is positive");
		}
		else if(userNum < 0) {
			System.out.println("The number is negative");
		}
		else if(userNum == 0) {
			System.out.println("The number is zero");
		}

		// else { System.out.println("The number is zero") } would have the same effect as lines 17-18, correct?
		
		scanner.close();
	}
}