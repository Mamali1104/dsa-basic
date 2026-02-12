package conditions;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter num a");
        int a = sc.nextInt();

        System.out.println("enter num b");
        int b = sc.nextInt();

        System.out.println("enter num c");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is greater");
        } else if (b > a && b > c) {
            System.out.println("B is greater");
        } else {
            System.out.println("C is greater");
        }
        int d = 9;

        String type = ((d > a) && (d > b) && (d > c)) ? "d is greater" : "d is not greater";
        System.out.println(type);

        System.out.println("enter your marks");
        int mark = sc.nextInt();

        String result = (mark > 33) ? "pass" : "fail";
        System.out.println(result);

        sc.close();
    }

}
