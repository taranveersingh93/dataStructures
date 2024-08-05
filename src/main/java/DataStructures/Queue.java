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

    public void printFirst() {
        System.out.println("First: "+first.value);
    }

    public void printLast() {
        System.out.println("Last: "+last.value);
    }

    public void printLength() {
        System.out.println("Length: "+length);
    }

    public void printQueue() {
        Node temp = this.first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
