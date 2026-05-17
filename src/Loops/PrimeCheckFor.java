import java.util.Scanner;

public class PrimeCheckFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) { System.out.println("not prime"); sc.close(); return; }
        boolean prime = true;
        for (int i = 2; i*i <= n; i++) if (n % i == 0) { prime = false; break; }
        System.out.println(prime ? "prime" : "not prime");
        sc.close();
    }
}
