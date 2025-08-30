#Task1 - java code and output

import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for 3 subjects(out of 100):");
        
        System.out.print("Subject 1: ");
        double subject1 = scanner.nextDouble();
        
        System.out.print("Student 2: ");
        double subject2 = scanner.nextDouble();
        
        System.out.print("Student 3: ");
        double subject3 = scanner.nextDouble();
        
        //Calculate average
        double average = (subject1 + subject2 + subject3) / 3;
        
        //Determine grade
          String grade;
          
          if(average >= 90) {
              grade = "A+";
          } else if (average >= 80) {
              grade = "A";
          } else if (average >= 70) {
              grade = "B";
          } else if (average >= 60) {
              grade = "C";
          } else if (average >= 50) {
              grade = "D";
          } else {
              grade = "F";
          }
          
          System.out.printf("Average marks: %.2f%n", average);
          System.out.println("Grade: " + grade);
          
          scanner.close();
       } 
    }
#Output:- 
Enter marks for 3 subjects(out of 100):
Subject 1: 90
Student 2: 98
Student 3: 88
Average marks: 92.00
Grade: A+
