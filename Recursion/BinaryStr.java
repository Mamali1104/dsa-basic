public class BinaryStr {
    public static void printStr(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printStr(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printStr(n - 1, 1, str + "1");

        }

    }

    public static void main(String[] args) {
        int n = 3;
        printStr(n, 0, "");

    }

}
