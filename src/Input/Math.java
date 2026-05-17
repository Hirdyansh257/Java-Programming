package Input;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your First number :");
        int num1 = s.nextInt();
        System.out.println("Enter your Second number :");
        int num2 = s.nextInt();

        //Add
        int sum = num1 + num2 ;

        //Subtract
        int subtract = num1-num2 ;

        //Product
        int multiple = num1 * num2 ;

        // Divide
        int divide = num1 / num2 ;

        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiple);
        System.out.println(divide);
    }
}
