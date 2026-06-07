import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kitne students hain? ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] grades = new double[n];

    
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " ka naam: ");
            names[i] = sc.next();
            System.out.print("Student " + (i + 1) + " ka grade: ");
            grades[i] = sc.nextDouble();
        }

    
        double sum = 0, highest = grades[0], lowest = grades[0];
        String topStudent = names[0], lowStudent = names[0];

        for (int i = 0; i < n; i++) {
            sum += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
                topStudent = names[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
                lowStudent = names[i];
            }
        }

        double average = sum / n;

        
        System.out.println("\n=============================");
        System.out.println("     STUDENT GRADE REPORT    ");
        System.out.println("=============================");
        System.out.printf("%-15s %-10s%n", "Name", "Grade");
        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10.2f%n", names[i], grades[i]);
        }
        System.out.println("=============================");
        System.out.printf("Average Score  : %.2f%n", average);
        System.out.printf("Highest Score  : %.2f (%s)%n", highest, topStudent);
        System.out.printf("Lowest Score   : %.2f (%s)%n", lowest, lowStudent);
        System.out.println("=============================");

        sc.close();
    }
}