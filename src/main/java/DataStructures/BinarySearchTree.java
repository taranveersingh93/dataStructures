package DataStructures;

public class BinarySearchTree {
    public Node root;
    public class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
            return true;
        }
        Node temp = this.root;
        while (temp != null) {
            if (temp.value == value) {
                return false;
            }
            if (temp.value > value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
        return false;
    }

    public boolean contains(int value) {
        if (this.root == null) {
            return false;
        }
        Node temp = this.root;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            return true;
        }
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return this.rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        Node newNode = new Node(value);
        if (currentNode == null) {
            return newNode;
        }
        if (currentNode.value == value) {
            return null;
        }
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        rInsert(this.root, value);
    }
}
