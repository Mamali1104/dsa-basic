package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("********");
        }
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int n = sc.nextInt();
        // for (int i = n; i >= 1; i--) {
        // System.out.println(i);

        // }

        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;

        }
        System.out.println(rev);

        // prime or not
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not a prime.");
            }

        }

        sc.close();

    }

}
