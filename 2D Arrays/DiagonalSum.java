public class DiagonalSum {

    public static int printDiagonalSum(int matrix[][]) {// o(n2)
        int sum = 0;

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {

        // // primary
        // if (i == j) {
        // sum = sum + matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // sum = sum + matrix[i][j];
        // }

        // }
        // }
        // return sum;

        // optimized code
        for (int i = 0; i < matrix.length; i++) {
            // primary
            sum += matrix[i][i];
            // secondary
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];// matrix[i][j=n-i-1]
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(printDiagonalSum(matrix));
    }

}
