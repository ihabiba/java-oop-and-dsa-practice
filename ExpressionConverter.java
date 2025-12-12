// Class for handling infix to postfix conversion
class ExpressionConverter {
    // Check if a character is an operator
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Check the precedence of operators
    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Convert infix expression to postfix
    public String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>(); 
        Queue<Character> postfix = new Queue<>(); 

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {  // Operand
                postfix.enqueue(c);
            } else if (c == '(') {  // Left parenthesis
                stack.push(c);
            } else if (c == ')') {  // Right parenthesis
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.enqueue(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // Remove '('
                else throw new RuntimeException("Mismatched parentheses");
            } else if (isOperator(c)) {  // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.enqueue(stack.pop());
                }
                stack.push(c);
            } else {
                throw new RuntimeException("Invalid character");
            }
        }

        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (top == '(') throw new RuntimeException("Mismatched parentheses");
            postfix.enqueue(top);
        }

        StringBuilder result = new StringBuilder();
        while (!postfix.isEmpty()) {
            result.append(postfix.dequeue());
        }
        return result.toString();
    }
}
