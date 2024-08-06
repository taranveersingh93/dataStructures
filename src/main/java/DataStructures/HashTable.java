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

        private int hash(String key) {
            int hash = 0;
            char[] keyChars = key.toCharArray();
            for (int i = 0; i < keyChars.length; i++) {
                int asciiValue = keyChars[i];
                hash += (asciiValue*31)%dataMap.length;
            }
            return hash;
        }

        public void set(String key, int value) {
            int index = hash(key);
            Node newNode = new Node(key, value)
            if (dataMap[index] == null) {
                dataMap[index] = newNode;
            } else {
                Node temp = dataMap[index];
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            dataMap[index] = new Node(key, value);
        }
    }

}
