import java.util.Stack;

public class remove_k_di {
    public static void main(String[] args) {
        String num = "10200";
        int k = 1;

        Stack<Character> s = new Stack<>();

        // LEFT to RIGHT push karenge
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            // jab tak stack empty nahi aur top digit > current digit,
            // tab tak delete karo (k times)
            while (!s.isEmpty() && k > 0 && s.peek() > c) {
                s.pop();
                k--;
            }

            s.push(c);
        }

        // Agar k abhi bhi bacha ho, last se delete karo
        while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }

        // Stack → String
        StringBuilder sb = new StringBuilder();
        for (char c : s) sb.append(c);

        // Leading zeros hatana
        String res = sb.toString().replaceFirst("^0+(?!$)", "");
if (res.length() == 0) res = "0";
        System.out.println(res);
    }
}
