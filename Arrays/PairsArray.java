
public class PairsArray {
    public static void pairs_array(int numbers[]) {
        int totalpairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total no of pairs:" + totalpairs);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 6, 8, 9, 10 };
        pairs_array(numbers);

    }
}
