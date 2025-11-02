package stack;

public class StackImplementationUsingLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void traveseStackLinkedList() {
        if (head == null) {
            System.out.println("Cannot travese - Stack Linked List Not Available");
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

    public void pushNode(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
            size++;
        } else if (head.next == null) {
            head.next = node;
            tail = node;
            size = 2;
        } else if (size >= 2 && node.next == null) {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public int popNode() {
        if (head == null) {
            System.out.println("The stack is empty!!!");
            return -1;
        }
        int popValue = tail.value;
        // Case 1: Only one element
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return popValue;
        }
        // Case 2: More than one element
        Node prevNode = head;
        while (prevNode.next != tail) {
            prevNode = prevNode.next;
        }
        prevNode.next = null;
        tail = prevNode;
        size--;
        if (size == 0) {
            head = null;
            tail = null;
        }
        return popValue;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackImplementationUsingLinkedList stackList = new StackImplementationUsingLinkedList();
        stackList.pushNode(1);
        stackList.pushNode(3);
        stackList.pushNode(4);

        stackList.traveseStackLinkedList();

        System.out.println("Popping last node " + stackList.popNode());
        stackList.traveseStackLinkedList();

        System.out.println("Popping last node " + stackList.popNode());
        stackList.traveseStackLinkedList();

        System.out.println("Popping last node " + stackList.popNode());
        stackList.traveseStackLinkedList();
    }
}
