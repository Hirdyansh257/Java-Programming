import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        switch (code) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            default: System.out.println("other");
        }
        sc.close();
    }
}
