package DataStructures;public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public class Node {
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
    }

    public void printHead() {
        System.out.print("Head: "+this.head.value);
    }

    public void printTail() {
        System.out.print("Tail: "+this.tail.value);
    }

    public void printLength() {
        System.out.print("Length: "+this.length);
    }
}
