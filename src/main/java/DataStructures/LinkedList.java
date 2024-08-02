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
}
