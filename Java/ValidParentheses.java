import java.util.Stack;

public class ValidParentheses {
    public static boolean isVaild(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if ((c == ']' || c == '}' || c == ')') && stack.isEmpty()) {
                return false;
            } else if ((c == ']' && stack.peek() == '[')
                    || (c == '}' && stack.peek() == '{')
                    || (c == ')' && stack.peek() == '(')) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isVaild("1+2+(3+4)*5+(6/2)"));
        System.out.println(isVaild("1+2+(3+4)*5+(6/2)))"));
        System.out.println(isVaild("[(])"));
    }
}
