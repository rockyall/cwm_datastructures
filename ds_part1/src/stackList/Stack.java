package stackList;

public class Stack {
    private int[] stackArray;
    private int count;

    public Stack(int length){
        count = 0;
        stackArray = new int[length];
    }

    public void push(int item){
        //[0,0,0,0] -> [0,0,0,1] -> [0,0,2,1] -> [0,3,2,1]
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
        var lastElement = stackArray[count - 1];
        stackArray[count - 1] = 0;
        count--;
        return lastElement;
    }

    public int peek(){
        if(isEmpty()) return -1;
        return stackArray[count - 1];
    }

    public Boolean isFull() {
        if(stackArray.length == count) return true;
        return false;
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public void printStack(){
        for(var item : stackArray){
            System.out.println(item);
        }
    }

    //push
    //pop
    //peek
    //isEmpty
    //int[]
}
