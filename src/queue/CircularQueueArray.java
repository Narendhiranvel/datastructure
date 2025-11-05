package queue;

public class CircularQueueArray {
    int maxSize;
    public int[] queueArray;
    public int startOfQueue;
    public int topOfQueue;
    public int currentSize;

    public CircularQueueArray(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        startOfQueue = 0;
        topOfQueue = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        topOfQueue = (topOfQueue + 1) % maxSize;
        queueArray[topOfQueue] = value;
        currentSize++;
        System.out.println(value + " enqueued.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = queueArray[startOfQueue];
        startOfQueue = (startOfQueue + 1) % maxSize;
        currentSize--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[startOfQueue];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < currentSize; i++) {
            int index = (startOfQueue + i) % maxSize;
            System.out.print(queueArray[index] + " <- ");
        }
        System.out.println();
    }

    public void deleteQueue() {
        queueArray = null;
        startOfQueue = 0;
        topOfQueue = -1;
        currentSize = 0;
        System.out.println("Queue deleted successfully!");
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public static void main(String[] args) {
        CircularQueueArray cq = new CircularQueueArray(5);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.printQueue();

        System.out.println("Dequeued: " + cq.dequeue());
        cq.printQueue();

        cq.enqueue(5);
        cq.printQueue();

        cq.enqueue(6);
        cq.printQueue();

        System.out.println("Peek: " + cq.peek());

        cq.deleteQueue();
    }
}

// Time Complexity: O(1) -- Ignore print queue
// Space Complexity: O(n)
