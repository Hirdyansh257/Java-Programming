package Input;

import java.util.Scanner;

public class ScannerPractise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Age :");
        int age = s.nextInt();

        s.nextLine();
        System.out.println("Enter your Name:");
        String name = s.nextLine();

        System.out.println("Hey! My name is " + name + " ,and i'm " + age + " years old ." );
    }
}
