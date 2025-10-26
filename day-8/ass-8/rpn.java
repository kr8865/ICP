import java.util.Stack;

public class rpn{
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; // truncates toward 0
                }
            } else {
                stack.push(Integer.parseInt(token));  // Convert string to int
            }
        }

        stack.pop();  // Final result
        
    }
}