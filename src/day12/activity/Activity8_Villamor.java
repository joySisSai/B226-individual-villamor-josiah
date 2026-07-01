package day12.activity;

import java.util.Scanner;

public class Activity8_Villamor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // how big the report is: rows = students, columns = subjects
        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int subjectCount = scanner.nextInt();
        scanner.nextLine(); // clear the leftover newline so nextLine() below works

        // one name per subject, used later as the table's column headers
        String[] subjects = new String[subjectCount];
        for (int j = 0; j < subjects.length; j++) {
            System.out.print("Enter the name of subject " + (j + 1) + ": ");
            subjects[j] = scanner.nextLine();
        }

        // parallel data: names[i] belongs to the grades in row grades[i]
        String[] names = new String[studentCount];
        double[][] grades = new double[studentCount][subjectCount];

        // fill in each student's name and their grade in every subject
        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter " + names[i] + "'s grade in " + subjects[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // clear newline before the next student's name
        }

        // ---- Grades Report table ----
        System.out.println("\n===== GRADES REPORT =====");

        // Alignment: the number in each specifier is the column width and "-"
        // left-aligns, so values are space-padded to a fixed width (15/12/10)
        // and columns line up; ".2f" also forces two decimals (e.g. 90.00).
        System.out.printf("%-15s", "Student");
        for (String subject : subjects) {
            System.out.printf("%-12s", subject);
        }
        System.out.printf("%-10s%n", "Average");

        // one line per student: name, each grade, then their computed average
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-15s", names[i]);

            double sum = 0; // running total of this student's grades
            for (int j = 0; j < subjectCount; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
                sum += grades[i][j];
            }

            double average = sum / subjectCount; // double keeps the decimals
            System.out.printf("%-10.2f%n", average);
        }

        scanner.close();
    }
}
