package queue;

public class QueueLinkedList {
    protected Node head;
    protected Node tail;
    int size = 0;

    public void traveseQueueLinkedList() {
        if (head == null) {
            System.out.println("Cannot travese - Queue Linked List Not Available");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    public void enqueue(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot Dequeue!! No elements in the Queue");
            return -1;
        }
        int firstQueNode = head.value;
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return firstQueNode;
        }
        head = head.next;
        size--;
        return firstQueNode;
    }

    public int peek() {
        if (head == null) {
            System.out.println("The Queue is empty!!!");
            return -1;
        }
        return head.value; // first of the Queue
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSizeOfQueue() {
        return size;
    }

    public String deleteQueue() {
        head = null;
        tail = null;
        size = 0;
        return "Entire Queue Deleted";
    }

    public static void main(String[] args) {
        QueueLinkedList qLL = new QueueLinkedList();
        qLL.enqueue(1);
        qLL.enqueue(2);
        qLL.enqueue(3);
        qLL.traveseQueueLinkedList();
        System.out.println("Checking IsEmpty " + qLL.isEmpty());

        System.out.println("size------ " + qLL.getSizeOfQueue());
        System.out.println("peek------ " + qLL.peek());
        System.out.println("dequeue------ " + qLL.dequeue());
        qLL.traveseQueueLinkedList();

        System.out.println("dequeue------ " + qLL.dequeue());
        qLL.traveseQueueLinkedList();

        System.out.println("dequeue------ " + qLL.dequeue());
        qLL.traveseQueueLinkedList();

        qLL.enqueue(1);
        System.out.println("peek------ " + qLL.peek());
        System.out.println("Deleting ---- " + qLL.deleteQueue());
        System.out.println("size------ " + qLL.getSizeOfQueue());
    }
}

// Time Complexity: O(n) - Without Traversing O(1)
// Space complexity: O(n)