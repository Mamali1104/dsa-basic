public class tille {
    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical
        int fnm1 = tilingProblem(n - 1);
        // horizontal
        int fnm2 = tilingProblem(n - 2);
        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));

    }

}
