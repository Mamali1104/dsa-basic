public class sorted {
    public static boolean sortarr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortarr(arr, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 49, 5 };
        System.out.println(sortarr(arr, 0));

    }

}
