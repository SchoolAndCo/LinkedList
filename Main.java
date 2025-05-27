import LinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("Add elements to the end:");
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.printAll(); // Expected: 1 2 3

        System.out.println("Add element to the front:");
        list.addFirst("0");
        list.printAll(); // Expected: 0 1 2 3

        System.out.println("Add element at index 2:");
        list.addIndex(2, "1.5");
        list.printAll(); // Expected: 0 1 1.5 2 3

        System.out.println("Delete first element:");
        list.deleteFirst();
        list.printAll(); // Expected: 1 1.5 2 3

        System.out.println("Delete last element:");
        list.deleteLast();
        list.printAll(); // Expected: 1 1.5 2

        System.out.println("Delete element at index 1:");
        list.deleteIndex(1);
        list.printAll(); // Expected: 1 2

        System.out.println("Add multiple again:");
        list.addLast("3");
        list.addFirst("0");
        list.addIndex(2, "1.5");
        list.printAll(); // Expected: 0 1 1.5 2 3

        System.out.println("Delete all one by one:");
        list.deleteIndex(0); // 1 1.5 2 3
        list.deleteIndex(0); // 1.5 2 3
        list.deleteIndex(0); // 2 3
        list.deleteIndex(0); // 3
        list.deleteIndex(0); // empty
        list.printAll(); // Expected: (empty line)
    }
}
