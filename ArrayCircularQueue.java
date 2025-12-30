
package dsa;

public class ArrayCircularQueue {
    int[] arr;
    int front = 0, rear = 0, size = 0, capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void enqueue(int x) {
        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int dequeue() {
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
}

