package loops;

import java.util.*;

public class While {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        int m = 1;
        while (m <= n) {
            System.out.println(m);
            m++;
        }
        System.out.println("enter the natural naumber");
        int num = sc.nextInt();
        int sum = 0;
        int s = 1;
        while (s <= num) {
            sum += s;
            s++;

        }
        System.out.println(sum);
        sc.close();

    }

}
