package dsPart1.stackList;

import java.util.Arrays;

public class Stack {
    private int[] stackArray;
    public int count;

    public Stack(int length){
        count = 0;
        stackArray = new int[length];
    }

    public void push(int item){
        if(isFull()){
            var newarray = new int[count * 2];
            for(int i = 0; i < count; i++){
                newarray[i] = stackArray[i];
            }
            stackArray = newarray;
        }
        stackArray[count++] = item;
    }

    public int pop(){
        if(isEmpty()) return -1;
        var lastElement = stackArray[--count];
        stackArray[count] = 0;
        return lastElement;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return stackArray[count - 1];
    }

    public Boolean isFull() {
        if(count == stackArray.length) return true;
        return false;
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public void printStack(){
        var content = Arrays.copyOfRange(stackArray, 0, count);
        for(var item : content){
            System.out.println(item);
        }
    }

    public int[] getStack(){
        return Arrays.copyOfRange(stackArray, 0, count);
    }

    //push
    //pop
    //peek
    //isEmpty
    //int[]
}
