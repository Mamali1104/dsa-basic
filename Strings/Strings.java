import java.util.Scanner;

public class Strings {

    public static void printLetter(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean CheckPallindrum(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            int n = name.length();
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // input
        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next(); // for only single name
        name = sc.nextLine(); // for full name
        // System.out.println(name.charAt(0));
        // printLetter(name);

        System.out.println(CheckPallindrum(name));

    }

}