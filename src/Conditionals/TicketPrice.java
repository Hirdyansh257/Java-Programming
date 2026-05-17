import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 5) System.out.println(0);
        else if (age <= 12) System.out.println(50);
        else if (age <= 60) System.out.println(100);
        else System.out.println(70);
        sc.close();
    }
}
