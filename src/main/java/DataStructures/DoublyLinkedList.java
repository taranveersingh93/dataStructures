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
            this.length--;
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

    public void prepend (int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node oldHead = this.head;
            this.head = newNode;
            newNode.next = oldHead;
            oldHead.prev = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }
        if (this.length == 1) {
            Node removedNode = this.head;
            this.head = null;
            this.tail = null;
            this.length--;
            return removedNode;
        }
        Node removedNode = this.head;
        Node newHead = removedNode.next;
        removedNode.next = null;
        newHead.prev = null;
        this.head = newHead;
        this.length--;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return removedNode;
    }

    public Node getByIndex(int index) {
        if (index < 0 || index > this.length) {
            return null;
        }
        Node temp = this.head;
        if (index < this.length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i-- ) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean setByIndex(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }
        Node temp = this.head;
        if (index < this.length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }

        Node newNode = new Node(value);
        if (index == 0) {
            Node oldHead = this.head;
            newNode.next = oldHead;
            oldHead.prev = newNode;
            this.head = newNode;
            this.length++;
            return true;
        }

        if (index == this.length) {
            Node oldTail = this.tail;
            oldTail.next = newNode;
            newNode.prev = oldTail;
            this.tail = newNode;
            this.length++;
            return true;
        }
        Node temp = this.head;
        if (index < this.length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        Node prevNode = temp.prev;
        prevNode.next = newNode;
        newNode.next = temp;
        newNode.prev = prevNode;
        temp.prev = newNode;
        this.length++;
        return true;
    }
}
