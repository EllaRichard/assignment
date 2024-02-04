//I was testing the looping of the years, semester and courses for my CGPA calculator

import java.util.Scanner;
public class CGPACalculatortwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter number of years: ");
        int numberOfYears = in.nextInt();


        int year, semester, courses;
        for (year = 1; year <= numberOfYears; year++) {
            System.out.println("year " + year + ".");
            for (semester = 1; semester <= 2; semester++) {
                System.out.println("Semester " + semester + ":");
                System.out.println("enter number of courses: ");
                int numberOfCourses = in.nextInt();
                for (courses = 1; courses <= numberOfCourses; courses++) {
                    System.out.println(courses + ".");
                }
            }
        }
    }
}