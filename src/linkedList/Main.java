package linkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
        System.out.println(sLL.size);
        System.out.println(sLL.head.next);
        System.out.println(sLL.tail.value);
        System.out.println(sLL.tail.next);
    }
}
