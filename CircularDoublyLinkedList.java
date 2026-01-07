
package dsa;

class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
            return;
        }
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 20 30
    }
}

