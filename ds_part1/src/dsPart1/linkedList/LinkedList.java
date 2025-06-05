package dsPart1.linkedList;

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
        var current  = first;
        while (current != null){
            if(current.value == item) return counter;
            current = current.next;
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

    public int[] toArray(){
        var resp = new int[count];

        var counter = 0;
        var current = first;
        while(current != null){
            resp[counter] = current.value;
            current = current.next;
            counter++;
        }

        return resp;
    }

    public void reverse(){
        if(IsEmpty()) return;

        Node previous = null;
        var pointer = first;
        var nextNode = pointer.next;
        while(pointer != null){
            pointer.next = previous;
            if (nextNode == null){
                first = pointer;
                break;
            }

            previous = pointer;
            pointer = nextNode;
            nextNode = nextNode.next;
        }
    }

    public void reversev2(){
        if(IsEmpty()) return;
        var previous = first;
        var current = first.next;
        while(current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public int kthNode(int kth){
        if(IsEmpty()) return -1;
        var distance = kth;
        var step = 0;

        var firstPointer = first;
        var secondPointer = first;
        while (secondPointer != null){

            if(step == distance){
                firstPointer = firstPointer.next;
                secondPointer = secondPointer.next;
            }else{
                step++;
                secondPointer = secondPointer.next;
            }

            if(secondPointer == null){
                return  firstPointer.value;
            }
        }

        return -1;
    }

    public int hasLoop(){
        if(IsEmpty()) return -1;
        var slow = first;
        var fast = first;
        last.next = first.next.next;

        while(true){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow.value;
            }
        }
    }


    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
    // size
    // toArray
}
