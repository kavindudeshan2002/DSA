/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

// File: LinkedListFIFOQueue.java
class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListFIFOQueue {
    private QueueNode front, rear;

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear != null) rear.next = newNode;
        rear = newNode;
        if (front == null) front = rear;
    }

    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue is empty");
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public void display() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

