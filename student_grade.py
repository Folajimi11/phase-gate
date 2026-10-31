school_header = """
=+=+=+=+=+=+=+==+=+=+=+=+=
LAGBAJA	STUDENT GRADES
=+=+=+=+=+=+=+==+=+=+=+=+=
"""
print(school_header)

students = int(input("How many students do you have? ")) 
subjects = int(input("How many subjects do they offer? "))
print("Saving>>>>>>>>>>>>>>>>>>>>>>>>")
print("Saved Successfully")
print()

average = []
positions = []
total_scores = []
sum_scores = []
for student in range(students):
	print(school_header)
	print(f'Entering score for student {student + 1}')
	
	student_scores = []
	sums = 0
	
	for index in range(subjects):
		scores = int(input(f'Enter score for subject {index + 1}: '))
		
		if(scores >= 0 and scores <= 100):
			print("Saving>>>>>>>>>>>>>>>>>>>>>>>>")
			print("Saved Successfully")
			print()
		
			student_scores.append(scores)
#			total_scores.append(student_scores)
			sums += scores
		else:
			print("Invalid input! Enter a score from 0-100")
			scores = 0
			student_scores.append(scores)
	total_scores.append(sums)
	average.append(sums/subjects)
	
for student in range(students):
    position = 1
    for index in range(students):
        if total_scores[index] > total_scores[student]:
            position += 1
    positions.append(position)
print()

print("=+=+=+=+=+=+=+=+=+=+=+= CLASS SUMMARY =+=+=+=+=+=+=+=+=+=+=+")
print("============================================================")
print("STUDENT		SUB1	SUB2	SUB3	TOTAL	AVE	POS")	
print("============================================================")
for index in range(students):
	print(f'Student {index + 1} \t' , end= " ")
	for count in range(subjects):
		print(student_scores[count], end = "\t")
	print(f'{total_scores[index]} \t {average[index]:.2f} \t {positions[index]}')
	print()
print("=============================================================")	
print("=============================================================")	
	

		
