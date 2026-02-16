
public class Binary {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 3, 9, 28, 45, 67, 74, 80, 90, 95 };
        int key = 67;
        System.out.println("index of binary search:" + binarySearch(numbers, key));

    }
}
