import java.util.Stack;

public class BasicCalc {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char lastSign = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

           
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

          
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {

                if (lastSign == '+') {
                    stack.push(currentNumber);
                } 
                else if (lastSign == '-') {
                    stack.push(-currentNumber);
                } 
                else if (lastSign == '*') {
                    stack.push(stack.pop() * currentNumber);
                } 
                else if (lastSign == '/') {
                    stack.push(stack.pop() / currentNumber);
                }

                lastSign = c;   
                currentNumber = 0;
            }
        }

        int result = 0;
        for (int num : stack) result += num;
        return result;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s)); // Output: 7
    }
}
