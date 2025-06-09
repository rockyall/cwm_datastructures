package dsPart1.queuesList;

import java.util.Arrays;

public class PriorityQueue {
    private int[] list;
    private int count;

    public PriorityQueue(int length){
        list = new int[length];
    }

    public void add(int item){
        if(isFull()) resize();
        var index = shiftItemsToInsert(item);
        list[index] = item;
        count++;
    }



    public int remove(){
        if(isEmpty()) return -1;
        return list[--count];
    }

    public int peek(){
        if(isEmpty()) return  -1;
        return list[count - 1];
    }

    public int shiftItemsToInsert(int item){
        int i;
        for(i = count - 1; i >= 0; i--){
            if(list[i] > item){
                list[i + 1] = list[i];
            }else {
                break;
            }
        }
        return i + 1;
    }

    public void resize(){
        var newList = new int[list.length + 1];
        for(int i = 0; i< list.length; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    //failed try
    public void insert(int item){
        if(isFull()) return;

        var newList = new int[list.length + 1];
        for (int i = 0; i< list.length; i++){
            newList[i] = list[i];
        }
        list = newList;

        for(int i = count; i >= 0; i--){
            if(list[i] < item){
                list[i + 1] = item;
                item = list[i];
                list[i] = item;
                break;
            }
            if(list[i] > item){
                list[i + 1] = list[i];
                list[i] = item;
            }
        }
        count++;
    }

    public Boolean isFull(){
        return count == list.length;
    }

    public Boolean isEmpty(){
        return count == 0;
    }

    public int[] toArray(){
        return Arrays.copyOfRange(list, 0, count);
    }

    public void println(){
        var newList = toArray();
        System.out.println(Arrays.toString(newList));
    }

    public void printlnarray(){
        var newList = toArray();
        System.out.println(Arrays.toString(newList));
    }
}
