package linkedList;

public class SinglyLinkedList {
    protected Node head;
    protected Node tail;
    protected int size;

    protected Node createSinglyLinkedList(int nodeVal) {
        Node node = new Node();
        node.value = nodeVal;
        node.next = null;

        head = node;
        tail = node;
        size = 1;

        return head;
    }
}
