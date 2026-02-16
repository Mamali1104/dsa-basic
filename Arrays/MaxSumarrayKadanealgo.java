public class MaxSumarrayKadanealgo {
    public static void max_sum_kandane(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                maxSum = 0;
                currSum = 0;
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }

        }
        System.out.println("maximun sum is:" + maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -7, 2, 4, -1, -5, 9, -3 };
        max_sum_kandane(numbers);
    }
}
