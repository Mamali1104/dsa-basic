public class power {
    public static int calpow(int x, int n) {//O(n)
        if (n == 1) {
            return 1;
        }
        // return x*calpow(x, n-1);
        int xnm1 = calpow(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedpower(int a, int m) {// O(logn)
        if (m == 0) {
            return 1;
        }
        int halfPow = optimizedpower(a, m / 2);
        int halfPowSq = halfPow * halfPow;
        // for odd
        if (m % 2 != 0) {
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(calpow(3, 3));
        System.out.println(optimizedpower(3, 4));

    }

}
