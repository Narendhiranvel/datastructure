package LinkedListProblems;

public class MergeTwoLists {
    public static void main(String[] args) {
        // Create first sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge lists
        MergeTwoLists solution = new MergeTwoLists();
        ListNode merged = solution.mergeTwoLists(list1, list2);

        // Print merged list
        printList(merged);
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        if (p1 != null) {
            current.next = p1;
        } else if (p2 != null) {
            current.next = p2;
        }
        return dummy.next;
    }
}

// Time complexity - O(m+n)
// Space complexity - O(1)
