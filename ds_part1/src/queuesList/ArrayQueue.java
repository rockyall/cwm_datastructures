package queuesList;

import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int counter;

    public ArrayQueue(int _length){
        queue = new int[_length];
        front = 0;
        rear = 0;
        counter = 0;
    }

    public void enqueue(int item){
        if(isFull()) return;
        queue[rear] = item;

        rear = (rear + 1) % queue.length;
        counter++;
    }

    public int dequeue(){
        if(isEmpty()) return -1;
        var lastItem = queue[front];
        queue[front] = 0;

        front = (front + 1) % queue.length;
        counter--;
        return lastItem;
    }

    public int peek(){
        if(isEmpty()) return  -1;
        return queue[front];
    }

    public Boolean isEmpty(){
        return counter == 0;
    }

    public Boolean isFull(){
        return counter == queue.length;
    }

    public void println(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println(Arrays.toString(queue));
    }

    //enqueue
    //dequeue
    //peek
    //isEmpty done
    //isFull done
}
