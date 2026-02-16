import java.util.*;

public class ArraysCC {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Physics marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter Chemistry marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter Maths marks");
        marks[2] = sc.nextInt();
        System.out.println("phy:" + marks[0]);
        System.out.println("Chem:" + marks[1]);
        System.out.println("math:" + marks[2]);

        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}