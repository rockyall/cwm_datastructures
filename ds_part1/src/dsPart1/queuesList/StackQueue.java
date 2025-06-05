package dsPart1.queuesList;

import dsPart1.stackList.Stack;

import java.util.Arrays;

public class StackQueue {
    private Stack stack1;
    private int front;
    private int rear;
    private int counter;

    public StackQueue(int length){
        stack1 = new Stack(length);
    }

    public void enqueue(int item){
        stack1.push(item);
        counter++;
    }

    public int dequeue(){
        var tempStack = new Stack(stack1.count);

        while(!stack1.isEmpty()){
            tempStack.push(stack1.pop());
        }

        var itemPeeked = tempStack.pop();

        front = tempStack.peek();
        while(!tempStack.isEmpty()){
            stack1.push(tempStack.pop());
        }
        rear = stack1.peek();

        counter--;
        return itemPeeked;
    }

    public int peek(){
        return front;
    }

    public Boolean isEmpty(){
        return counter == 0;
    }

    public Boolean isFull(){
        return counter == stack1.count;
    }

    public void println(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println(Arrays.toString(stack1.getStack()));
    }
    //enqueue
    //dequeue
    //peek
    //isEmpty done
    //isFull done
}
