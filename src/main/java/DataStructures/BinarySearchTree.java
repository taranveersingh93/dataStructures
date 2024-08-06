package DataStructures;

public class BinarySearchTree {
    Node root;
    public class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }
}
