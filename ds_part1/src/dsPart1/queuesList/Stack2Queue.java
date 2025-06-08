package dsPart1.queuesList;

import dsPart1.linkedList.Node;
import dsPart1.stackList.Stack;

import java.util.Arrays;

public class Stack2Queue {
    private Stack stack1;
    private Stack stack2;

    public Stack2Queue(int _lenght){
        stack1 = new Stack(_lenght);
        stack2 = new Stack(_lenght);
    }

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        getLastQueue();
        return stack2.pop();
    }

    public int peek(){
        return getLastQueue();
    }

    public Boolean IsEmpty(){
        if(stack1.isEmpty() && stack2.isEmpty()) return true;
        return false;
    }

    public int getLastQueue(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public void println(){
        var array1 = stack1.getStack();
        var array2 = stack2.getStack();

        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        for(int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
