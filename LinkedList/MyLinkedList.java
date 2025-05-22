package LinkedList;

/*
 * addFirst(String value)
 * addLast(String value)
 * addIndex(int index, String value)
 * deleteFirst()
 * deleteLast()
 * deleteIndex(int index)
 * printAll()
 */

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    // private Node<T> pointer;


    public void addLast(T value) {
        Node<T> new_node = new Node<T>(value);

        if (head == null) {
            head = new_node;
            head.next = new_node;
            return;
        }


        if (tail == null) {
            tail = new_node;
        }
    }

    public void printAll() {
        if (head == null && tail == null) {
            System.out.println("Empty list");
        }

        Node<T> ptr;

        if (head != null) {
            ptr = head;
        } else {
            ptr = tail;
        }

        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.nextNode((head != null ? 1 : -1));
        }
        
    }
}
