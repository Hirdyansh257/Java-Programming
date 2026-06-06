package Methods;

import java.util.Scanner;

public class Check_EvenOdd {
    public static void main(String[] args) {
        checkNumber();

    }

    static int checkNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int number = s.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even Number ");

        } else {
            System.out.println(number + " is an Odd Number ");
        }
        return number;
    }
    }
