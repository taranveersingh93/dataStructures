package DataStructures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

public class LinkedList {
    private static final Logger log = LoggerFactory.getLogger(LinkedList.class);
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        //create a new node and head points to it
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }
    public class Node {
        public int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public void printList() {
        Node temp = this.head;

        for (int i = 0; i < this.length; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void printHead() {
        System.out.println(head.value);
    }

    public void printTail() {
        System.out.println(tail.value);
    }

    public void printLength() {
        System.out.println(length);
    }

    public void append(int value) {
        //create a new node and have tail and last node point to it
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void prepend(int value) {
        //create a new node that points to first node and have head point to it then.
        Node newNode = new Node(value);

        if (this.length == 0) {
            newNode.next = null;
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        Node temp = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            temp.next = null;
        }
        this.length--;
        return temp;
    }
}
