import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int i = 0;
        while (i < n) {
            System.out.println(a);
            int t = a + b;
            a = b;
            b = t;
            i++;
        }
        sc.close();
    }
}
