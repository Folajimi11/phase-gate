public class DimentionalArray{
	public static int[][] reverse(int [][]array){
		for(int row = 0; row < array.length; row++){
			for(int index = 0; index < array[row].length; index++){
				for(int count = index + 1; count < array[row].length; count++){
						int temp = array[row][index];
						array[row][index] = array[row][count];
						array[row][count] = temp;

				}
			}
		}
		return array;	
	}
	
	public static void main(String...args){
		int [][] array = {
			{1,2,3,6,7,4},
			{4,5,6},
			{7,8,9}	
			};
			
		int [][]result = reverse(array);
		for(int index = 0; index < result.length; index++){
			for(int count = 0; count < result[index].length; count++){
				System.out.print(result[index][count] + ", ");
			}
			System.out.println();
		}
	}
}
	
	
