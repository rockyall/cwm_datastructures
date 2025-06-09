package dsPart1.queuesList;

import dsPart1.linkedList.LinkedList;
import dsPart1.linkedList.Node;

public class LinkedListQueue {
    private LinkedList list;
    private int size;

    public LinkedListQueue(){
        list = new LinkedList();
    }
    //2- Build a queue using a linked list from scratch. Implement the
    //following operations and calculate their runtime complexities.
    //- enqueue -> o(1)
    //- dequeue -> o(1)
    //- peek  -> o(n)
    //- size -> o(1)
    //- isEmpty -> o(1)

    public void enqueue(int item){
        list.addLast(item);
        size++;
    }

    public void dequeue(){
        list.deleteFirst();
        size--;
    }

    public int peek(){
        if(list.IsEmpty()) return 0;
        var itemArray = list.toArray();
        return itemArray[0];
    }

    public int size(){
        return size;
    }

    public Boolean isEmpty(){
        return list.IsEmpty();
    }

    public void println(){
        list.printList();
    }
}
