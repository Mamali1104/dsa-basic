public class selectionSort {
    public static void Selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minNum = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minNum] < arr[j]) {
                    minNum = j;
                }
            }
            // swap
            int temp = arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 2, 4, 9, 1 };
        Selection_sort(arr);
        print(arr);
    }

}
