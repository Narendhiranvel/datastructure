package queue;

public class LinearQueueArray {
    int maxSize;
    public int[] queueArray;
    public int startOfQueue;
    public int topOfQueue;

    public LinearQueueArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        startOfQueue = -1;
        topOfQueue = -1;
    }

    public void enqueue(int value) {
        if (topOfQueue == maxSize - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        queueArray[++topOfQueue] = value;
        if (topOfQueue == 0) {
            startOfQueue++;
        }
    }

    public int dequeue() {
        if (isEmpty() || startOfQueue > topOfQueue) {
            System.out.println("Couldn't dequeue since the queue is empty");
            return -1;
        }
        int value = queueArray[startOfQueue++];
        if (startOfQueue > topOfQueue) { // queue became empty after dequeue
            startOfQueue = -1;
            topOfQueue = -1;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Unable to peek the queue is Empty");
            return -1;
        }
        return queueArray[startOfQueue];
    }

    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    private boolean isFull() {
        return topOfQueue == queueArray.length - 1;
    }

    public void deleteQueue() {
        startOfQueue = -1;
        topOfQueue = -1;
        System.out.println("Queue deleted (logically).");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queuse is Empty!!");
            return;
        }
        for (int i = startOfQueue; i <= topOfQueue; i++) {
            System.out.print(queueArray[i]);
            System.out.print("<-");
        }
    }

    public static void main(String[] args) {
        LinearQueueArray lQA = new LinearQueueArray(4);
        System.out.println("is Empty " + lQA.isEmpty());
        System.out.println("Printing Queue ");
        lQA.printQueue();
        lQA.enqueue(1);
        lQA.enqueue(2);
        lQA.enqueue(3);
        lQA.enqueue(4);
        System.out.println("is Full " + lQA.isFull());
        System.out.println("Printing Queue ");
        lQA.printQueue();
        System.out.println();
        System.out.println("Dequeue ---------------");
        System.out.println();
        System.out.println("Peek: " + lQA.peek());
        System.out.println(lQA.dequeue());
        lQA.printQueue();
        System.out.println();
        System.out.println("Peek: " + lQA.peek());
        System.out.println(lQA.dequeue());
        lQA.printQueue();
        System.out.println();
        System.out.println("Peek: " + lQA.peek());
        System.out.println(lQA.dequeue());
        lQA.printQueue();
        System.out.println();
        System.out.println("Peek: " + lQA.peek());
        lQA.deleteQueue();
        lQA.printQueue();
        lQA.enqueue(11);
        lQA.enqueue(22);
        lQA.enqueue(33);
        lQA.enqueue(44);
        System.out.println("is Full " + lQA.isFull());
        System.out.println("Printing Queue ");
        lQA.printQueue();
    }
}
// Time Complexity: O(1) -- Ignore print queue
// Space Complexity: O(n)
