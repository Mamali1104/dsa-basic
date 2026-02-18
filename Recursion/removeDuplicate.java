public class removeDuplicate {
    public static void removedulpli(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // work
        char currChar = str.charAt(idx);
        // duplicate
        if (map[currChar - 'a'] == true) {
            removedulpli(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removedulpli(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removedulpli(str, 0, newStr, map);

    }
}
