package conditions;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter your number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("the even number is" + num);
        } else {
            System.out.println("the odd number is" + num);

        }

        sc.close();

    }

}
