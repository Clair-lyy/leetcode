public class ReverseInteger {
    public static int reverse(int num) {
        long reversed = 0;
        while (num != 0) {
            reversed *= 10;
            reversed += num % 10;
            num /= 10;
        }
        return (reversed <= Integer.MAX_VALUE && reversed >= Integer.MIN_VALUE) ? (int) reversed : 0;
    }

    // 超出整数边界的情况
    public static void main(String[] args) {
        System.out.println(reverse(123456789));
    }
}
