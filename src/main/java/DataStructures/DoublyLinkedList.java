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
        public int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
    }

    public void printHead() {
        System.out.print("Head: "+this.head.value+"\n");
    }

    public void printTail() {
        System.out.print("Tail: "+this.tail.value+"\n");
    }

    public void printLength() {
        System.out.print("Length: "+this.length+"\n");
    }

    public void printList() {
        Node temp = this.head;
        while(temp != null) {
            System.out.print(temp.value+"\n");
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }   else {
            Node tailNode = this.tail;
            tailNode.next = newNode;
            newNode.prev = tailNode;
            this.tail = newNode;
        }
            this.length++;
    }

    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }
        if (this.length == 1) {
            Node temp = this.head;
            this.head = null;
            this.tail = null;
            return temp;
        }
        Node deleteNode = this.tail;
        Node newTail = deleteNode.prev;
        this.tail = newTail;
        deleteNode.next = null;
        newTail.next = null;
        this.length--;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return deleteNode;
    }
}
