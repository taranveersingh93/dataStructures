package DataStructures;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


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

    private Node deleteNode (Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        }
        else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) { //leaf node
                return null;
            }
            if (currentNode.left == null) { //node only on right
                return currentNode.right;
            }
            if (currentNode.right == null) { //node only on left
                return currentNode.left;
            }
            // nodes on both sides
            int subTreeMin = minValue(currentNode.right); //get the min value on right side
            currentNode.value = subTreeMin; //replace currentNode with that val
            currentNode.right = deleteNode(currentNode.right, subTreeMin); //remove the leaf min
        }
        return currentNode;
    }

    public int minValue(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }
        if (currentNode.left == null) {
            return currentNode.value;
        }
        return minValue(currentNode.left);
    }
    public void rDelete(int value) {
        Node currentNode = this.root;

    }

    public ArrayList<Integer> breathFirstSearch() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }
}
