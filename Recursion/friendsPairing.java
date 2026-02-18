public class friendsPairing {
    public static int friendsPair(int n) {
        // base
        if (n == 1 || n == 2) {
            return n;
        }
        // kaam
        // single
        int fnm1 = friendsPair(n - 1);
        // pair
        int fnm2 = friendsPair(n - 2);
        int pairways = (n - 1) * fnm2;
        // total ways
        int totalways = fnm1 + pairways;
        return totalways;

        // return friendsPair(n-1) + (n-1)* friendsPair(n-2); 3,4,7,10,11
    } 

    public static void main(String[] args) {
        System.out.println(friendsPair(2));

    }

}
