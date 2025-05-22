package LinkedList;

public class Node<T> {
    public Node<T> previous = null;
    public Node<T> next = null;
    public T value;

    public Node() {}

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> previous, Node<T> next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Node<T> nextNode(int direction) {
        if (direction == 1) {
            return this.next;
        }

        return this.previous;
    }
}
