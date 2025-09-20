import java.util.Scanner;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 24.76f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'd';
        int number = ch;
        System.out.println(number);

        char n = 'm';
        char p = 'k';
        System.out.println(n - p);
        System.out.println((int) (n));
        System.out.println((int) (p));

        int x = 90;
        float y = 45.76f;
        char r = 'q';
        double z = 345;

        short s = 345;
        byte w = 2;
        double ans = (y * w) + (x % r) - (z - s);
        System.out.println(ans);

        byte j = 5;
        byte l = (byte) (j * 2);
        System.out.println(l);

        sc.close();
    }

}
