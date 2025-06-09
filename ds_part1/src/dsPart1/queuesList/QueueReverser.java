package dsPart1.queuesList;

import dsPart1.stackList.Stack;

public class QueueReverser{
    public int[] reverse(int[] list, int knumber){
        //1- Given an integer K and a queue of integers, write code to reverse the
        //order of the first K elements of the queue.
        //Input: Q = [10, 20, 30, 40, 50], K = 3
        //Output: Q = [30, 20, 10, 40, 50]
        //Stack: Q = [10, 20, 30, 0, 0] -> [30, 20, 10, 40, 50]
        //Solution: QueueReverser.reverse()
        //solution: use stacks;

        if(knumber > list.length){
            throw new IllegalArgumentException();
        }

        Stack st = new Stack(knumber);
        for(int i = 0; i < knumber; i++){
            st.push(list[i]);
        }

        int counter = 0;
        while (!st.isEmpty()){
            list[counter++] = st.pop();
        }
        return list;
    }
}
