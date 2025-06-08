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
        int i;
        for(i = count - 1; i >= 0; i--){
            if(list[i] > item){
                list[i + 1] = list[i];
            }else {
                break;
            }
        }
        list[i + 1] = item;
        count++;
    }

    public int remove(){
        return list[--count];
    }

    public int peek(){
        return list[count - 1];
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

    public void println(){
        var newList = Arrays.copyOfRange(list, 0, count);
        System.out.println(Arrays.toString(newList));
    }

    public void printlnarray(){
        var newList = Arrays.copyOfRange(list, 0, count);
        System.out.println(Arrays.toString(newList));
    }
}
