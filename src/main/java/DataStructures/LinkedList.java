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

    public Node removeLast() {
        Node temp = this.head;
        Node pre = this.head;

        if (this.length == 0) {
            return null;
        } else {
            for (int i = 1; i <= this.length; i++) {
                if (i == this.length) {
                    pre.next = null;
                    this.tail = pre;
                    length--;

                    if (length == 0) {
                        this.head = null;
                        this.tail = null;
                    }
                    return temp;
                } else {
                    pre = temp;
                    temp = temp.next;
                }
            }
        }
        return null;
    }

    public Node getNodeByIndex(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        Node temp = this.head;
        for (int i = 0; i < this.length; i++) {
            if (i == index) {
                return temp;
            } else {
                temp = temp.next;
            }
        }
        return null;
    }

    public boolean setNodeByIndex(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.length; i++) {
                if (i == index) {
                    temp.value = value;
                    return true;
                } else {
                    temp = temp.next;
                }
            }
            return false;
        }
    }

    public boolean insertNodeAtIndex(int index, int value) {
        if(index < 0 || index >this.length) {
            return false;
        } else {
            Node temp = this.head;
            Node insertedNode = new Node(value);
            if (index == 0) {
                insertedNode.next = temp;
                this.head = insertedNode;
                this.length++;
                return true;
            } else if (index == this.length) {
                insertedNode.next = null;
                this.tail.next = insertedNode;
                this.tail = insertedNode;
                this.length++;
                return true;
            } else {
                for (int i = 0; i < this.length; i++) {
                    if (i == index - 1) {
                        insertedNode.next = temp.next;
                        temp.next = insertedNode;
                        this.length++;
                        return true;
                    } else {
                        temp = temp.next;
                    }
                }
            }
        }
        return false;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        } else if (index == 0) {
            Node temp = this.head;
            this.head = this.head.next;
            this.length--;
            return temp;
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.length; i++) {
                if (i == index - 1) {
                    Node nextNode = temp.next.next;
                    Node deleteNode = temp.next;
                    temp.next = nextNode;
                    deleteNode.next = null;
                    this.length--;
                    return deleteNode;
                } else {
                    temp = temp.next;
                }
            }
        }
        return null;
    }
}
