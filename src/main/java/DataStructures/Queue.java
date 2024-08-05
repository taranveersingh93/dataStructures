package DataStructures;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        this.first = new Node(value);
        this.last = this.first;
        this.length = 1;
    }
}
