package Basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators");

        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        // Assignment Operators
        System.out.println("\nAssignment Operators");

        int num = 20;

        num += 5;
        System.out.println("num += 5 : " + num);

        num -= 2;
        System.out.println("num -= 2 : " + num);

        // Increment / Decrement Operators
        System.out.println("\nIncrement / Decrement Operators");

        int count = 1;

        count++;
        System.out.println("count++ : " + count);

        count--;
        System.out.println("count-- : " + count);
    }
}
