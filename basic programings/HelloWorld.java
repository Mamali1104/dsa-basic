import java.util.*;

public class HelloWorld {
    public static void main(String args[]) {
        // input name
        System.out.println("print your name");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // for single name eg tony
        String input = sc.nextLine(); // for full name eg. Dudu phudu
        System.out.println(input);

        // input number
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println(num);

        // input float
        System.out.println("enter a Float number");
        float numb = sc.nextFloat();
        System.out.println(numb);

        sc.close();

    }
}
