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

        public void printTable() {
            for (int i = 0; i < dataMap.length; i++) {
                System.out.println(i+": ");
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.print("   {"+temp.key+"= "+temp.value+"} ");
                }
            }
        }
    }

}
