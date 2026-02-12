package Arithemetic;

public class logical {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int exp1 = (a * (b / a));
        System.out.println(exp1);

        b %= 5;
        System.out.println(b);

        if (a > 0 && b < 0) {
            System.out.println("condition checked");
        } else {
            System.out.println("invalid input");
        }
    }

}
