package Problems;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("How many students in the Class : ");
        int class_student = s.nextInt();

        System.out.println("how many Subject Marks you Have : ");
        int student_subject = s.nextInt();
        s.nextLine();

        System.out.println("Enter your Subject Names : ");
        String[] Subject_name = new String[student_subject];
        for (int i = 0; i < student_subject; i++) {
            Subject_name[i] = s.nextLine();
        }

        String[] array1 = new String[class_student];
        System.out.println("Enter Students Name : ");

        for (int i = 0; i < class_student; i++) {
            array1[i] = s.nextLine();
        }

        int[][] array2 = new int[class_student][student_subject];
        System.out.println("Enter Marks here : ");
        for (int i = 0; i < class_student; i++) {
            for (int j = 0; j < student_subject; j++) {
                array2[i][j] = s.nextInt();
            }
            s.nextLine();
        }
        for (int i = 0; i < class_student; i++) {
            double avg = calulate_average(array2[i]);
            String grade = get_Grade(avg);
            System.out.printf(array1[i] + " | Avg: %.2f | Grade: " + grade + "%n", avg);
        }
        int Topper = 0;
        for (int i = 1; i < class_student; i++) {
            if (calulate_average(array2[i]) > calulate_average(array2[Topper])) {
                Topper = i;
            }
        }
        System.out.println("TOPPER: " + array1[Topper]);
    }

    static double calulate_average(int[] Marks) {
        int total = 0;
        for (int i = 0; i < Marks.length; i++) {
            total = total + Marks[i];
        }
        double average = (double) total / Marks.length;

        return average;
    }

    static String get_Grade(double average) {
        if (average > 90) {
            return (" A+ ");
        } else if (average > 80) {
            return (" A ");
        } else if (average > 70) {
            return (" B ");
        } else if (average > 60) {
            return (" C ");
        } else if (average > 50) {
            return (" D ");
        } else {
            return (" Fail ");
        }
    }
}
