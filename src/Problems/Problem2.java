package Problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers with you want to play : ");
        int array_size = s.nextInt();
        s.nextLine();
        int[] Num = new int[array_size];
        System.out.println("Enter your Numbers : ");
        for (int i = 0; i < array_size; i++) {
            Num[i] = s.nextInt();
            s.nextLine();
        }
        // Sum
        System.out.println("Sum of Numbers : " + calculate_Sum(Num));

// Max
        System.out.println("Largest Number : " + find_Max(Num));

// Min
        System.out.println("Smallest Number: " + find_Min(Num));

// Prime
        System.out.print("Prime Numbers: ");
        for (int i = 0; i < Num.length; i++) {
            if (check_Prime(Num[i])) {
                System.out.print(Num[i] + " ");
            }
        }
        System.out.println();
        check_EvenOdd(Num);
        System.out.println();
        System.out.println("Negative Count: " + count_Negative(Num));

    }

    static void check_EvenOdd(int[] number) {
        System.out.println("Even Numbers : ");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + ",");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers : ");
        for (int j = 0; j < number.length; j++) {
            if (number[j] % 2 != 0) {
                System.out.print(number[j] + ",");
            }
        }
    }

    static boolean check_Prime(int Prime) {
        if (Prime <= 1) {
            return false;
        } else {
            for (int i = 2; i < Prime; i++) {
                if (Prime % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int calculate_Sum(int[] Sum) {
        int total = 0;
        for (int i = 0; i < Sum.length; i++) {
            total += Sum[i];
        }
        return total;
    }

    static int find_Max(int[] max) {
        int big = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > big) {
                big = max[i];
            }

        }
        return big;
    }

    static int find_Min(int[] min) {
        int small = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i] < small) {
                small = min[i];

            }
        }
        return small;
    }

    static int count_Negative(int[] Number) {
        int count = 0;
        for (int i = 0; i < Number.length; i++) {
            if (Number[i] < 0) {
                count = count + 1;

            }
        }
        return count;
    }

}
