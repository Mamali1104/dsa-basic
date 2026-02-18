public class firstOccurenece {
    public static int fo(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return fo(arr, key, i + 1);

    }

    public static int lo(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lo(arr, i + 1, key);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 4, 4, 4, 4, 4 };
        System.out.println(fo(arr, 0, 4));
        System.out.println(lo(arr, 0, 4));

    }
}
