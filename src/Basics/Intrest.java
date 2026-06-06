package Basics;

import java.util.Scanner;

public class Intrest {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your Amount : ");
    int money = s.nextInt();

    System.out.println("Enter Give Rate of Interest : ");
    float rate = s.nextFloat();

    System.out.println("Enter Duretion for Holding Money : ");
    int time = s.nextInt();

    float Return = money * rate * time / 100 ;

    System.out.println("Your Interest Amount is :" + Return );
    float amount = Return + money ;
    System.out.println("And the Actual amount you recive : " + amount);
}
    
}
