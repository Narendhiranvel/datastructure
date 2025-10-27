package linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.insertLinkedList(1, 0);
        sLL.insertLinkedList(2, 1);
        sLL.insertLinkedList(3, 2);
        sLL.insertLinkedList(4, 3);
        sLL.insertLinkedList(5, 4);
        sLL.insertLinkedList(33, 3);

        System.out.println("Traversing through Node-----------");
        sLL.traveseSinglyLinkedList();
        System.out.println("Searching the Node----------");
        sLL.searchNode(33);
        System.out.println("Deleting the Node and traversing--------");
        sLL.deleteNodeFromLinkedList(33);
        sLL.traveseSinglyLinkedList();
        System.out.println("Deleting entire linked list--------");
        sLL.deleteEntireLinkedList();
        sLL.traveseSinglyLinkedList();
    }
}
