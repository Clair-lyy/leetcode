public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {
        if (arr.length == 0) {
            return null;
        }
        for (int i = 0; i < arr[0].length(); i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i >= arr[j].length() || arr[0].toCharArray()[i] != arr[j].toCharArray()[i]) {
                    return arr[0].substring(0, i);
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "abcd", "a"};
        System.out.println(longestCommonPrefix(arr));
    }
}
