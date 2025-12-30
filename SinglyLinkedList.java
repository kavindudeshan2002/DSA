
package dsa;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }

    Node head;

    public void insert(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }
}

