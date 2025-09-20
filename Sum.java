import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1");
        int num1 = sc.nextInt();

        System.out.println("enter num1");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

        int prod = num1 * num2;
        System.out.println(prod);

        System.out.println("enter the radius");
        float rad = sc.nextFloat();

        float area = 3.141f * rad * rad; // put 3.141f for float
        System.out.println(area);

        sc.close();

    }

}
