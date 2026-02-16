public class SubArray {
    public static void sub_array(int numbers[]) {
        int ts = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];

                }
                ts++;
                System.out.println();

            }
            System.out.println();

        }

        System.out.println("summation of subarray is:" + sum);
        System.out.println("total sub arrays:" + ts);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8 };
        sub_array(numbers);

    }
}
