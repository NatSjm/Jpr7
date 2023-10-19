public class Main {
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
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
        ListNode head = new ListNode(1);
        ListNode item_2 = new ListNode(2);
        head.next = item_2;
        ListNode item_3 = new ListNode(3);
        item_2.next = item_3;
        ListNode item_4 = new ListNode(4);
        item_3.next = item_4;
        ListNode item_5 = new ListNode(5);
        item_4.next = item_5;

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseLinkedList(head);
        System.out.println("Reversed List:");
        printList(reversedHead);
    }

}