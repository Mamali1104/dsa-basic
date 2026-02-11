import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // q1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        // q2
        double temp = 103.8;
        if (temp > 100) {
            System.out.println("you have fever");
        } else {
            System.out.println("you don't have fever");
        }

        // q3
        System.out.println("enter the week number");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tueday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
                break;

            default:
                System.out.println("invalid input");
                break;
        }

        // q5
        System.out.println("enter the year");
        int year = sc.nextInt();
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("this is Leap year");
        } else {
            System.out.println("not a leap year");
        }

        sc.close();

    }

}
