import java.util.Scanner;

public class Checking {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of student in class: ");
		int studentNumber = scanner.nextInt();
		
		System.out.print("Enter the number of subject offered: ");
		int subjectsOffered = scanner.nextInt();
		
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		
		int[][] scores = new int[studentNumber][subjectsOffered];
		
		for (int index = 0; index < scores.length; index++) {
			System.out.println("\n--- Entering scores for Student " + (index + 1) + " ---");
			
			for (int count = 0; count < scores[index].length; count++) {
				// We create a temporary variable to hold the input for validation
				int inputScore;
				
				// This loop keeps running until a valid score (0-100) is entered
				while (true) {
					System.out.print("Enter score for subject " + (count + 1) + ": ");
					inputScore = scanner.nextInt();
					
					if (inputScore >= 0 && inputScore <= 100) {
						// Score is valid! Break out of the validation loop
						break; 
					} else {
						System.out.println("Invalid score input (Must be between 0 and 100). Try again!");
					}
				}
				
				// Now save the valid score into the array
				scores[index][count] = inputScore;
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully");
			}
		}
		
		// Optional: View the final grades summary
		System.out.println("\n--- Final Saved Grades ---");
		for (int index = 0; index < scores.length; index++) {
			System.out.print("Student " + (index + 1) + ": ");
			for (int count = 0; count < scores[index].length; count++) {
				System.out.print(scores[index][count] + " ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}

