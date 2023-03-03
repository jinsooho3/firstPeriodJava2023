import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        int[][] grades = new int[numOfStudents][];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the number of grades for student " + (i + 1) + ": ");
            int numOfGrades = scanner.nextInt();
            grades[i] = new int[numOfGrades];

            System.out.println("Enter the grades for student " + (i + 1) + ":");
            for (int j = 0; j < numOfGrades; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        System.out.println("All grades:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Average grades for each student:");
        for (int i = 0; i < numOfStudents; i++) {
            int sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
            }
            double average = (double) sum / grades[i].length;
            System.out.println("Student " + (i + 1) + ": " + average);
        }

        int totalSum = 0;
        int totalGrades = 0;
        for (int i = 0; i < numOfStudents; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                totalSum += grades[i][j];
                totalGrades++;
            }
        }
        double totalAverage = (double) totalSum / totalGrades;
        System.out.println("Average grade for all students: " + totalAverage);
    }
}
