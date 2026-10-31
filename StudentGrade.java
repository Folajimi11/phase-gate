import java.util.Scanner;
public class StudentGrade{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have? ");
		int studentsNumber = input.nextInt();
		
		System.out.println("How many subjects do they offer?");
		int subjectsNumber = input.nextInt();
		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		
		int [][] array = new int [studentsNumber][subjectsNumber];
		int sum = 0;
		int [] sums = new int [studentsNumber];
		double [] average = new double [studentsNumber];
		int [] position = new int [studentsNumber];
		System.out.println();
		System.out.println();
		for(int index = 0; index < array.length; index++){
			System.out.println("Entering score for student " + (index + 1));
			for(int count = 0; count < array[index].length; count++){
				System.out.println("Enter score for subject " + (count + 1));
				int score = input.nextInt();
				if(score >= 0 && score <= 100){
					System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
					System.out.println("Saved successfully");
					System.out.println();
					array[index][count] = score;
					sum += score;
				}
				else{
					System.out.println("Invalid input, Enter a score from 0-100");
					break;
				}
			}
			
			for(int indexx = 0; indexx < sums.length; indexx++){
				sums[indexx] = sum;
				average[indexx] = sum/subjectsNumber;
				System.out.println("Subjects sum of Student " + (index + 1 ) + " is: " + sums[indexx]);
				System.out.println("Student average is " + (index + 1 ) + " is: " + average[indexx]);
				System.out.println();
				break;
			}

		}
		
		
//		for(int index = 0; index < sums.length; index++){
//			for(int count = index + 1; count < sums[index].length; count++){
//				if(sums[index] > sums[count]){
//					int temp = sums[index];
//					sums[index] = sums[count];
//					sums[count] = temp;
//				}
//			}
//		}
		
//		for(int index = 0; index < sums.length; index++){
//			position[index] = sums[index];
//			position = (index + 1);
//		}
//		for(int index = 0; index < sums.length; index++){
//			System.out.print(position[index]);
//		}	

		
		
System.out.println("=====================================================");
System.out.println("STUDENT		SUB1	SUB2	SUB3	TOTAL	AVE");
System.out.println("=====================================================");
for(int row = 0; row < array.length; row++){
	System.out.print("Student " + (row + 1) + "\t");
	for(int col = 0; col < array[row].length; col++){
		System.out.print(array[row][col] + "\t" + sums[col] + "\t" + average[col]);
		System.out.println(sums[col]+ "\t" + average[col]);
		System.out.println(average[col]);
	}
	System.out.println();
}
System.out.println("=====================================================");
System.out.println("=====================================================");
	
	
	}
}
