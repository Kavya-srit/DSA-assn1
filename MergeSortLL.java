class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortLL {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummyHead.next;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the linked list into two halves
        prev.next = null;

        // Recursively sort the two halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Merge the sorted halves
        return mergeTwoLists(left, right);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(13);
        l1.next = second;
        second.next = third;
        third.next = fourth;

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(9);

        System.out.println("Merged and Sorted Linked List:");
        ListNode mergedList = mergeTwoLists(l1, l2);
        ListNode sortedList = sortList(mergedList);
        printList(sortedList);
    }
}
