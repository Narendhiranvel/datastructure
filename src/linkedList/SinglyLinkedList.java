package linkedList;

public class SinglyLinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    protected Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;

        head = node;
        tail = node;
        size = 1;

        return head;
    }

    protected Node insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node prevNode = head;
            int index = 0;
            while (index < location - 1) {
                prevNode = prevNode.next;
                index++;
            }
            Node nextNode = prevNode.next;
            prevNode.next = node;
            node.next = nextNode;
        }
        size++;
        return node;
    }
}
