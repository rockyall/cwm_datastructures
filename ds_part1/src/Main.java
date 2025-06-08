import dsPart1.Array;
import dsPart1.queuesList.ArrayQueue;
import dsPart1.queuesList.PriorityQueue;
import dsPart1.queuesList.Stack2Queue;
import dsPart1.queuesList.StackQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        LinkedListExercise();
//        StacksExcercise();
//        StacksExcercise2();
//        StackExcersie3();
//        queueExcercise();
//        queueExcercise2();
        queueExcercise3();
    }

    public static void ArrayExcercie(){
        Array numbers = new Array(2);
        numbers.insert(33);
        numbers.printArray();

        System.out.println("\nShowing indexof");
        System.out.println(numbers.indexOf(45));

        System.out.println("\nNow we are removing items");
        numbers.removeAt(0);
        numbers.printArray();
    }

    public static void LinkedListExerciseBuilt(){
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(40);
        list.addLast(450);
        list.addFirst(20);
        list.addFirst(37);
        list.addFirst(58);

        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.contains(10));
    }

    public static void LinkedListExercise(){
        dsPart1.linkedList.LinkedList list = new dsPart1.linkedList.LinkedList();
        list.addLast(10);
        list.addLast(40);
        list.addLast(450);
        list.addFirst(20);
        list.addFirst(37);
        list.addFirst(58);
//        System.out.println(list.contains(20));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.kthNode(3));
        System.out.println(list.hasLoop());
    }


    public static void StacksExcercise(){
        String str = "abcd";
        System.out.println(str);
        var strArr = str.toCharArray();
        Stack<Character> sta = new Stack<Character>();
        for (int i = 0; i < strArr.length; i++){
            sta.push(strArr[i]);
        }

        var reversed = new StringBuilder();
        for (int i = 0; i < strArr.length; i++){
            var letter = sta.pop();
            reversed.append(letter);
        }

        System.out.println(reversed);
    }

    public static void StacksExcercise2(){
        var arrays = new char[3][2];
        arrays[0][0] = '(';
        arrays[0][1] = ')';
        arrays[1][0] = '[';
        arrays[1][1] = ']';
        arrays[2][0] = '<';
        arrays[2][1] = '>';

        Stack<Character> stack = new Stack<Character>();
        String str = "(([1] + (2)))[a]";
        for(char item : str.toCharArray()){ // time complexity O(2n)
            for(int i = 0; i < arrays.length; i++){
                if(arrays[i][0] == item){
                    stack.push(item);
                }
                if(arrays[i][1] == item){
                    if(stack.isEmpty()){
                        System.out.println("Is not balanced '" + item + "'");
                        return;
                    }
                    var previousCar = stack.peek();
                    if(arrays[i][0] == previousCar){
                        stack.pop();
                    }
                }
            }
        }

        System.out.println("Is string balanced: " + stack.isEmpty());
    }

    public static void StackExcersie3(){
        dsPart1.stackList.Stack stackArr = new dsPart1.stackList.Stack(1);
        stackArr.push(10);
        stackArr.push(50);
        stackArr.push(5);
        stackArr.push(59);
        stackArr.printStack();
        System.out.println("\nMethods");
        System.out.println(stackArr.pop());
        System.out.println(stackArr.peek());
        System.out.println(stackArr.isEmpty());
    }

    public static void queueExcercise(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(20);
        queue.add(35);
        queue.add(15);
        queue.add(78);
        System.out.println(Arrays.toString(queue.toArray()));
        queueReverse(queue);
        System.out.println(Arrays.toString(queue.toArray()));
    }

    public static void queueReverse(Queue<Integer> queue){
        var arrayStack = new Stack<Integer>();
        while(!queue.isEmpty()){
            var removedItem = queue.remove();
            arrayStack.push(removedItem);
        }

        while(!arrayStack.isEmpty()){
            var topItem = arrayStack.pop();
            queue.add(topItem);
        }
        //Only allow add, remove, isEmpty
    }

    public static void queueExcercise2(){
//        ArrayQueue queue = new ArrayQueue(6);
//        queue.enqueue(77);
//        queue.enqueue(82);

        Stack2Queue queue = new Stack2Queue(4);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();

        queue.println();
        System.out.println("\npeek");
        System.out.println("first : " + queue.peek());
//        System.out.println("Is full: " + queue.isFull());

    }

    public static void queueExcercise3(){
        PriorityQueue pq = new PriorityQueue(5);
        pq.add(5);
        pq.add(10);
        pq.add(20);
        pq.add(1);
        pq.add(30);
        pq.add(40);
        pq.remove();
        pq.printlnarray();

    }
}