function reverse(array){
for(let row = 0; row < array.length; row++){
	for(let index = 0; index < array[row].length; index++){
		for(let count = index + 1; count < array[row].length; count++){
				let temp = array[row][index];
				array[row][index] = array[row][count];
				array[row][count] = temp;
		}
	}
}
return array;	
}
let array = [[1,2,3],[4,5,6],[7,8,9]]
	
let result = reverse(array);
	console.log(result);
	


