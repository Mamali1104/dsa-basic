public class LinearSearch {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static int linearsearch2(String menu[], String item) {
        for (int i = 0; i <= menu.length; i++) {
            if (menu[i] == item) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 58, 3, 3, 9, 1, 78, 45, 67, 34, 90, 70, 35 };
        String menu[] = { "ice-cream", "cake", "biriyani", "coke", "chocolate" };
        String item = "biriyani";
        int key = 45;
        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is a index:" + index);

        }

        int index2 = linearsearch2(menu, item);
        if (index2 == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is a index:" + index2);

        }
    }
}
