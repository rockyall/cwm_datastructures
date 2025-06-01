import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(2);
        numbers.insert(33);
        numbers.printArray();
        numbers.insert(45);
        numbers.printArray();
        numbers.insert(78);
        numbers.printArray();
        numbers.insert(11);
        numbers.printArray();
        numbers.insert(895);
        numbers.printArray();

        System.out.println("\nShowing indexof");
        System.out.println(numbers.indexOf(45));

        System.out.println("\nNow we are removing items");
        numbers.removeAt(0);
        numbers.printArray();
        numbers.removeAt(0);
        numbers.printArray();
        numbers.removeAt(0);
        numbers.printArray();
        numbers.removeAt(4);
        numbers.printArray();
        numbers.removeAt(3);
        numbers.printArray();
        numbers.removeAt(2);
        numbers.printArray();
        numbers.removeAt(1);
        numbers.printArray();
        numbers.removeAt(0);
        numbers.printArray();


    }
}