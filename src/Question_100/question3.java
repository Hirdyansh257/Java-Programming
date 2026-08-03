package Question_100;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        int x = s.nextInt();
        System.out.println("Enter yout Second Number : ");
        int y = s.nextInt();

        int sum = x + y ;
        int sub = x - y ;
        int multiple = x * y ;
        int divide = x / y ;


        System.out.println("sum : " + sum);
        System.out.println("Subtract : " + sub);
        System.out.println("Product : " + multiple);
        System.out.println("Quotient : " + divide);
    }
}
