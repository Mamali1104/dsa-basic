import java.util.*;

public class Practice {
    public static void printCount(int array[][], int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == key) {
                    count++;

                }
            }
        }
        System.out.println("the no is :" + count);

    }

    public static void printSum(int array[][]) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("sum of second row is:" + sum);
    }

    public static void main(String[] args) {
        int array[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 4;
        printCount(array, key);
        printSum(array);

    }
}
