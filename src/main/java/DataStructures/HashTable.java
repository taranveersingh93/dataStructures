package DataStructures;

public class HashTable {
    private Node[] dataMap;

    public HashTable(int size) {
        dataMap = new Node[size]; //size should be prime to reduce collisions
    }

    public class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}
