package dsPart1.queuesList;

import javax.swing.plaf.IconUIResource;

public class StackWithTwoQueues {
    //3- Build a stack using two queues. Implement the following operations
    //and calculate their runtime complexities.
    //- push
    //- pop
    //- peek
    //- size
    //- isEmpty
    //Q1 -> [40, 30, 20, 0]
    //Q2 -> [500, 0, 0, 0]

    private ArrayQueue queue1;
    private ArrayQueue queue2;
    private int size;

    public StackWithTwoQueues(int _length){
        queue1 = new ArrayQueue(_length);
        queue2 = new ArrayQueue(_length);
    }

    public void push(int item){
        queue1.enqueue(item);
        size++;
    }

    public int pop(){
        var newQueue = new ArrayQueue(queue1.length);
        shiftItems();
        var item = queue1.dequeue();

        while (!queue2.isEmpty()){
            newQueue.enqueue(queue2.dequeue());
        }

        queue1 = newQueue;

        size--;
        return item;
    }

    public int peek(){
        var newQueue = new ArrayQueue(queue1.length);
        shiftItems();
        var item = queue1.peek();

        queue2.enqueue(queue1.dequeue());
        while (!queue2.isEmpty()){
            newQueue.enqueue(queue2.dequeue());
        }

        queue1 = newQueue;

        return item;
    }

    public int size(){
        return size;
    }

    public void shiftItems(){
        for(int i = 0; i < size - 1; i++){
            queue2.enqueue(queue1.dequeue());
        }
    }

    public void println(){
        queue1.println();
    }
}
