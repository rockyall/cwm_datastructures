import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListExercise();
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


}