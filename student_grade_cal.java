import java.util.Scanner;

public class student_grade_cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        int numSubjects = 3;
        int totalMarks = 0;

        // Use a for loop to take input for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 75) {
            grade = 'A';
        } else if (averagePercentage >= 65) {
            grade = 'B';
        } else if (averagePercentage >= 50) {
            grade = 'C';
        } else if (averagePercentage >= 35) {
            grade = 'D';
        } else {
            grade = 'W';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
