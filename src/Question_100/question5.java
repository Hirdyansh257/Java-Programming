package Question_100;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in );
        System.out.println("Enter Length of Rectangle : ");
        int l = s.nextInt();
        System.out.println("Enter Breadth of Rectangle : ");
        int b = s.nextInt();

        int area = l * b ;

        System.out.println("Area of rectangle is " + area);

        int perameter = 2 * (l+ b) ;

        System.out.println("Perameter of rectangle is " + perameter);
    }
}
