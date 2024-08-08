package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;
    public Heap() {
        heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap); // don't want to provide access to the actual heap
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0 && heap.get(parent(currentIndex)) < heap.get(currentIndex)) {
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }

    public Integer remove() { //can only remove parent node
        if (heap.size() == 0) {
            return null;
        }
        if (heap.size() == 1) {
            int temp = heap.get(0);
            heap.remove(0);
            return temp;
        }

        int removedNumber = heap.get(0);
        int lastIndex = heap.size() - 1;
        heap.set(0, heap.get(lastIndex));
        heap.remove(lastIndex);

        sinkdown(0);
        return removedNumber;
    }

    public void sinkdown(int index) {
       int startIndex = index;
       while (true) {
           int leftIndex = leftChild(index);
           int rightIndex = rightChild(index);
           if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(startIndex)) {
               startIndex = leftIndex;
           }
           if (rightIndex < heap.size() && heap.get(rightIndex) > heap.
                   get(startIndex) ) {
               startIndex = rightIndex;
           }
           if (startIndex != index) {
               swap(index, startIndex);
               index = startIndex;
           } else {
               return;
           }
       }

    }
}
