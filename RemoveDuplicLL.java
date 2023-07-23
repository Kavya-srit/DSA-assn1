import java.io.*;
import java.util.Scanner;

class LinkedList {
    static Node head;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void append(int value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new Node(value);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    void remove_duplicates(Node head) {
        Node ptr2 = null;
        Node ptr1 = head;

        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
            while (ptr2.next != null) {

                if (ptr1.val == ptr2.next.val) {
                    ptr2.next = ptr2.next.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    void printLinkedList(Node node) {
        while (node.next != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print(node.val);
    }
}

public class RemoveDuplicLL {
    public static void main(String[] args) {
        int size = 8;
        int[] arr = { 1, 5, 8, 6, 1, 7, 5, 4 };

        LinkedList linked_list = new LinkedList();
        for (int i = 0; i < size; i++) {
            linked_list.append(arr[i]);
        }
        System.out.println("Original Linked List:");
        linked_list.printLinkedList(LinkedList.head);
        linked_list.remove_duplicates(LinkedList.head);
        System.out.println("\nLinked List after removing duplicates:");
        linked_list.printLinkedList(LinkedList.head);
    }
}
