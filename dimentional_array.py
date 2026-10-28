def rearrange_array(numbers):
	result = []
	for index in range(len(numbers)):
		column = []
		for count in range(len(numbers[index])):
			column.append(numbers[index][(len(numbers[index])) - 1 - count])
		result.append(column)
	return result
	
print(rearrange_array([[1,2,3],[4,5,6],[7,8,9]]))
