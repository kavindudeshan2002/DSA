
package dsa;

public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;
        Node(int d) {
            data = d;
        }
    }

    Node head;

    public void insert(int data) {
        Node n = new Node(data);
        n.next = head;
        if (head != null) head.prev = n;
        head = n;
    }
}
