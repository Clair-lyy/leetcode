public class ClimbingStairs {
    public static int climbingStairs(int height) {
        if (height == 1) {
            return 1;
        }
        if (height == 2) {
            return 2;
        }
        int ways = 0;
        int pre = 1;
        int cur = 2;
        for (int i = 3; i <= height; i++) {
            ways = pre + cur;
            pre = cur;
            cur = ways;
        }
        return ways;
    }

    public static void main(String[] args) {
        System.out.println(climbingStairs(9));
    }
}
