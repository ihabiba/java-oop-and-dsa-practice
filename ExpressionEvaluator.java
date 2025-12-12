// Class for handling evaluation of postfix expressions
import java.util.Map;

class ExpressionEvaluator {
    // Evaluate a postfix expression
    public int evaluatePostfix(String postfix, Map<Character, Integer> values) {
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {  // Operand (digit)
                stack.push(c - '0');  // Convert char to integer
            } else if (Character.isLetter(c)) {  // Operand (letter)
                if (!values.containsKey(c)) {
                    throw new RuntimeException("Value for '" + c + "' is not provided.");
                }
                stack.push(values.get(c));  // Push the value of the letter
            } else {  // Operator
                int b = stack.pop();
                int a = stack.pop();

                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/':
                        if (b == 0) throw new ArithmeticException("Division by Zero");
                        stack.push(a / b);
                        break;
                    case '^': stack.push((int) Math.pow(a, b)); break;
                }
            }
        }

        return stack.pop();
    }
}
