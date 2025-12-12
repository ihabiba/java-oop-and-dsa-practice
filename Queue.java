// Implementation of Queue using Singly Linked List
class Queue<T> {
    private Node<T> front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Enqueue operation to add an element to the queue
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation to remove and return the front element
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Peek operation to view the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}
