package conditions;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {// calculater
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter oprator");
        char oparator = sc.next().charAt(0);
        switch (oparator) {
            case '+':
                System.out.println("additon is" + (a + b)); // always put break after evrry case for indivual ans//
                break;
            case '-':
                System.out.println("subtraction is" + (a - b));
                break;
            case '*':
                System.out.println("multiplication is" + (a * b));
                break;
            case '/':
                System.out.println("divison is" + (a / b));
                break;
            case '%':
                System.out.println("modulo is" + (a % b));
                break;

            default:
                System.out.println("invalid operator");
                break;
        }

        sc.close();

    }

}
