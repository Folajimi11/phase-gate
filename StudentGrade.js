const prompt = require("prompt-sync")();

let students = Number(prompt("How many students do you have? "));
let subjects = Number(prompt("How many subjects do they offer? "));
console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
console.log("Saved Successfully");
console.log();

let average = [];
let positions = [];
let totalScores = [];
let allScores = [];


for (let student = 0; student < students; student++){
    console.log(`Entering scores for student ${student + 1}`);
    let studentScores = [];
    let sums = 0;
    for (let index = 0; index < subjects; index++){
        let score = Number(prompt(`Enter score for subject ${index + 1}: `));
        if (score >= 0 && score <= 100){
            console.log("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
            console.log("Saved Successfully\n");
        } 
        else{
            console.log("Invalid input! Enter a score from 0-100");
            score = 0;
        }
        studentScores.push(score);
        sums += score;
    }
    allScores.push(studentScores);
    totalScores.push(sums);
    average.push(sums / subjects);
}


for (let student = 0; student < students; student++){
    let position = 1;
    for (let index = 0; index < students; index++){
        if (totalScores[index] > totalScores[student]){
            position++;
        }
    }
    positions.push(position);
}


console.log("\n=+=+=+=+=+=+=+=+= CLASS SUMMARY =+=+=+=+=+=+=+=+=");
console.log("STUDENT\t", "SUB1\t","SUB2\t","SUB3\t", "TOTAL\tAVE\tPOS");
console.log("======================================================");
for (let index = 0; index < students; index++) {
    console.log(`Student ${index + 1}\t`);
    for (let count = 0; count < subjects; count++) {
        process.stdout.write(allScores[index][count] + "\t");
    }
    console.log(`${totalScores[index]}\t${average[index]}\t${positions[index]}`);
}
console.log("======================================================");

