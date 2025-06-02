package linkedList;

public class LinkedList {
    private Node first;
    private Node last;
    private int count;

    public void addLast(int item){
        if(IsEmpty()){
            last = new Node(item, null);;
            first = last;
            count++;
            return;
        }

        var newNode = new Node(item, null);
        last.next = newNode;
        last = newNode;
        count++;
    }

    public void addLastOld(int item){
        if(IsEmpty()){
            first = new Node(item, null);;
            last = first;
            count++;
            return;
        }

        var newNode = new Node(item, null);
        while (first != null){
            if(first.next == null){
                first.next = newNode;
                last = first.next;
                break;
            }
        }
        count++;
    }

    public void addFirst(int item){
        if(IsEmpty()){
            first = new Node(item, null);
            last = first;
            count++;
            return;
        }

        var newNode = new Node(item, null);
        newNode.next = first;

        first = newNode;
        count++;
    }

    public void deleteFirst(){
        if(IsEmpty()) return;
        if(first == last){
            first = null;
            last = first;
            count--;
            return;
        }

        first = first.next;
        count--;
    }

    public void deleteLast(){
        if(IsEmpty()) return;
        var pointer = first;
        var previous = pointer;
        while (pointer != null){
            if(pointer.next == null){
                previous.next = null;
                last = previous;
                break;
            }
            previous = pointer;
            pointer = pointer.next;
        }
        count--;
    }

    public Boolean contains(int item){
        if(IsEmpty()) return false;
        var pointer = first;
        while (pointer != null){
            if(pointer.value == item) return true;
            pointer = pointer.next;
        }
        return  false;
    }

    public int indexOf(int item){
        if(IsEmpty()) return -1;

        var counter = 0;
        while (first != null){
            if(first.value == item) return counter;
            first = first.next;
            counter++;
        }

        return -1;
    }

    public void printList(){
        if(first == null) return;
        var pointer = first;
        while(pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }

    public Boolean IsEmpty(){
        if(first == null && last == null) return true;
        return false;
    }

    public int size(){
        return count;
    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
    // size
}
