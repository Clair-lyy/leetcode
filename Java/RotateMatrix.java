public class RotateMatrix {
    public static int[][] rotate(int[][] src) {
        int tmp;
        int n = src.length;
        for (int j = 0; j < n / 2 + 1; j++) {
            for (int i = j; i < (n - j) / 2 + 1; i++) {
                tmp = src[i][j];
                src[i][j] = src[j][n - i - 1];
                src[j][n - i - 1] = src[n - i - 1][n - j - 1];
                src[n - i - 1][n - j - 1] = src[n - j - 1][i];
                src[n - j - 1][i] = tmp;
            }
        }
        return src;
    }

    public static void main(String[] args) {
        int[][] rotate = rotate(new int[][]{{1, 1, 2, 2}, {2, 2, 3, 3}, {3, 3, 4, 4}, {4, 4, 5, 5}});
        for (int[] ele : rotate) {
            for (int e : ele) {
                System.out.print(String.valueOf(e) + ',');
            }
            System.out.println();
        }
    }
}
