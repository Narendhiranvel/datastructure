package heap;

import java.util.PriorityQueue;

public class HeapBasics {
    public static void main(String[] args) {
        // Fetches the minimum from the heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Fetches the maximum from heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        minHeap.add(5);
        minHeap.add(8);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(7);

        maxHeap.add(5);
        maxHeap.add(8);
        maxHeap.add(3);
        maxHeap.add(2);
        maxHeap.add(7);

        while (!minHeap.isEmpty()) {
            System.out.println("Minimum Heap " + minHeap.poll());
        }
        System.out.println();
        while (!maxHeap.isEmpty()) {
            System.out.println("Maximun Heap " + maxHeap.poll());
        }
    }
}
