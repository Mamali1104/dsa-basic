package conditions;

import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        System.out.println("enter your amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int tax;
        if (amount < 500000) {
            tax = 0;
        } else if (amount >= 500000 && amount <= 1000000) {
            tax = (int) (amount * 0.2);
        } else {
            tax = (int) (amount * 0.3);
        }
        System.out.println("your tax is" + tax);

        sc.close();
    }

}
