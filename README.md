# CODSOFT--Internship-
# CodSoft Java Development Internship - Completed Tasks

This repository contains the completed tasks for the CodSoft Java Development Internship. The internship focused on developing practical Java applications, and the following three tasks were successfully implemented:

1.  **Student Grade Calculator**
2.  **Currency Converter**
3.  **ATM Interface**


## Task 1: Student Grade Calculator

This application calculates the total marks, average percentage, and assigns a grade to a student based on marks obtained in multiple subjects.

**Features:**

*   Takes input of marks for various subjects.
*   Calculates the sum of marks and average percentage.
*   Determines the grade based on predefined percentage ranges.
*   Displays the total marks, average percentage, and assigned grade.
#Task1 - java code and output
#Code:
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
Output:-
Enter marks for 3 subjects(out of 100):
Subject 1: 90
Student 2: 98
Student 3: 88
Average marks: 92.00
Grade: A+



## Task 2: Currency Converter

This application allows users to convert amounts between different currencies.

**Features:**

*   Provides a user-friendly interface for selecting source and target currencies.
*   Takes input for the amount to be converted.
*   Performs currency conversion based on predefined or simulated exchange rates.
*   Displays the converted amount.

## Task 3: ATM Interface

This application simulates a basic Automated Teller Machine (ATM) with core functionalities like withdrawal, deposit, and balance inquiry.

**Features:**

*   Simulates an ATM environment with a main menu.
*   Allows users to perform withdrawal and deposit operations.
*   Enables users to check their account balance.
*   Includes basic input validation and error handling (e.g., insufficient balance for withdrawals).

