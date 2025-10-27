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
            return head;
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

    protected void traveseSinglyLinkedList() {
        if (head == null) {
            System.out.println("Cannot travese Singly Linked List Not Available");
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

    protected boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("The searched node " + tempNode.value + " found at position " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    protected void deleteNodeFromLinkedList(int nodeValue) {
        int index = 0;
        if (head == null) {
            System.out.println("Node can't be deleted since the LinkedList is empty");
            return;
        }
        // Case 1: Only one node
        if (head.value == nodeValue && head.next == null) {
            head = null;
            tail = null;
            size--;
            System.out.println("Node value " + nodeValue + " has been deleted from index " + index);
            return;
        }
        // Case 2: Deleting head when list has multiple nodes
        if (head.value == nodeValue && head.next != null) {
            head = head.next;
            size--;
            System.out.println("Node value " + nodeValue + " has been deleted from index " + index);
            return;
        }
        // Case 3: Delete node in the middle or end
        Node prevNode = head;
        while (prevNode.next != null && prevNode.next.value != nodeValue) {
            prevNode = prevNode.next;
            index++;
        }
        // Check if node was not found
        if (prevNode.next == null) {
            System.out.println("Node value " + nodeValue + " not found in the list");
            return;
        }
        // Safe to delete now
        prevNode.next = prevNode.next.next;

        // Update tail if last node was deleted
        if (prevNode.next == null) {
            tail = prevNode;
        }
        size--;
        System.out.println("Deleted node value " + nodeValue + " at index " + (index + 1));
    }

    public void deleteEntireLinkedList() {
        head = null;
        tail = null;
        System.out.println("The entire linked list has been deleted");
    }
}
