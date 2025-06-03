import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        LinkedListExercise();
        StacksExcercise();
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
        linkedList.LinkedList list = new linkedList.LinkedList();
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

}