/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

// File: LinkedListStack.java
class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListStack {
    private StackNode top;

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) throw new RuntimeException("Stack is empty");
        int value = top.data;
        top = top.next;
        return value;
    }

    public void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

