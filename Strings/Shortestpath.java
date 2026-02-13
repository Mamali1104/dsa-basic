public class Shortestpath {
    public static float getShorestestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }

        }
        // square root
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);

    }

    public static String findsuString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }

    public static void main(String[] args) {
        // String path = "SN";
        // System.out.println(getShorestestPath(path));
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(findsuString(str, 2, 5));

    }

}
