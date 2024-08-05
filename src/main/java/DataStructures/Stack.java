package DataStructures;

public class Stack {
    private Node top;
    private int height;

    public class Node {
        int value;
        Node next;
        public Node (int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        this.height = 1;
    }
}
