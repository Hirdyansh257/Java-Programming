import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = a;
        if (b > m) m = b;
        if (c > m) m = c;
        System.out.println(m);
        sc.close();
    }
}
