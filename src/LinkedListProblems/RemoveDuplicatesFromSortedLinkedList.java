package LinkedListProblems;

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(3);
        list1.next.next.next.next.next = new ListNode(3);
// Before deleting Duplicates
        ListNode.printList(list1);

        RemoveDuplicatesFromSortedLinkedList solution = new RemoveDuplicatesFromSortedLinkedList();
        ListNode nonDuplicates = solution.deleteDuplicates(list1);

// After deleting Duplicates
        ListNode.printList(nonDuplicates);
    }

    protected ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
