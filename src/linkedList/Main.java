package linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.insertLinkedList(1, 0);
        sLL.insertLinkedList(2, 0);
        sLL.insertLinkedList(3, 3);

        System.out.println(sLL.head.value);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        System.out.println(sLL.head.next.next.next.value);
    }
}
