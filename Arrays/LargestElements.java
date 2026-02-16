import java.util.*;

public class LargestElements {
    public static int LargestElements(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is:" + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 7, 1, 5 };
        System.out.println("lagest element value is:" + LargestElements(numbers));

    }
}
