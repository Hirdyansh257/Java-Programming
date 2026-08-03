package Question_100;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        System.out.println("Enter radius of circle : ");
        float radius = s.nextFloat();

        float pi = 3.14f;

        float area = pi * radius * radius ;

        float Circumference = 2 * pi * radius ;

        System.out.println("Area of Circle is : " + area);
        System.out.println("Circumference of circle is " + Circumference);
    }
}
