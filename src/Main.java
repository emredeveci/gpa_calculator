import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] classes = {"Math", "English", "Physics", "Chemistry", "Music"};
        double totalGrade = 0;
        int validGradesCount = 0;

        Scanner input = new Scanner(System.in);

        //loop through the classes array and ask the user for each grade
        //any grade that's not between 0 and 100 will not be reflected in the grade average
        for(String i: classes) {
            System.out.print("Enter your grade for " + i + ": " );
            int grade = input.nextInt();

            if (grade >=0 && grade <=100) {
                totalGrade += grade;
                validGradesCount++;
            } else {
                System.out.println("You have entered an invalid grade. This will not be reflected in your GPA.");
            }
        }

        if(validGradesCount > 0) {
            double averageGrade = totalGrade / validGradesCount;
            System.out.println("Your average grade is: " + averageGrade);
        } else {
            System.out.println("You have not entered any valid grades. An average grade could not be calculated.");
        }

        input.close();
    }
}