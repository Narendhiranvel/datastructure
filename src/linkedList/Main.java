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

        System.out.println(sLL.head.value);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        System.out.println(sLL.head.next.next.next.value);
        System.out.println(sLL.head.next.next.next.next.value);
    }
}
