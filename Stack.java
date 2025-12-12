// Implementation of Stack using Singly Linked List
class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    // Push operation to add an element to the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation to remove and return the top element
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Peek operation to view the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
