import java.util.Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '#') {
                stack1.add(c);
            } else {
                if (stack1.size() > 0) {
                    stack1.pop();
                }
            }
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (c != '#') {
                stack2.add(c);
            } else {
                if (stack2.size() > 0) {
                    stack2.pop();
                }
            }
        }

        if (stack1.size() != stack2.size()) {
            return false;
        }

        boolean flag = true;
        while (stack1.empty() == false) {

            if (stack1.peek() == stack2.peek()) {
                stack1.pop();
                stack2.pop();
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String s ="ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));

    }
}
