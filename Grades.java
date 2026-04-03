import java.util.*;

public class Grades {

    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Lala", 3.9);
        studentGrades.put("Farid", 3.2);
        studentGrades.put("Samira", 2.8);
        studentGrades.put("Ali", 3.9);
        studentGrades.put("Jasmin", 2.5);
        studentGrades.put("Ayan", 3.5);

        System.out.println("=== Student Grades ===");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n=== Student(s) with Highest GPA ===");
        double maxGPA = Collections.max(studentGrades.values());
        System.out.println("Highest GPA: " + maxGPA);
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() == maxGPA) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        double sum = 0;
        for (double gpa : studentGrades.values()) {
            sum += gpa;
        
        double averageGPA = sum / studentGrades.size();
        System.out.printf("%n=== Average GPA ===%n%.2f%n", averageGPA);

        System.out.println("\n=== Students Below Average GPA ===");
        int countBelowAverage = 0;
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            if (entry.getValue() < averageGPA) {
                countBelowAverage++;
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("Total students below average: " + countBelowAverage);
    }
}
 
