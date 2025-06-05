package dsPart1;

public class Array {
    int[] array;
    int pointer;
    public Array(int _length){
        array = new int[_length];
        pointer = 0;
    }

    public void insert(int numberValue){
        if(array.length == 0){
            array = new int[1];
            pointer = 0;
        }

        if(pointer >= array.length){
            var oldArray = array;
            array = new int[oldArray.length * 2];
            for(int i = 0; i < oldArray.length; i++){
                array[i] = oldArray[i];
            }
        }

        array[pointer] = numberValue;
        pointer = pointer + 1;
    }

    public int removeAt(int index){
        if(array.length == 0){
            return -1;
        }
        if(index == array.length){
            return -1;
        }

        var value = array[index];
        array[index] = 0;
        var oldArray = array;
        var newArray = new int[oldArray.length - 1];
        var newArrayCounter = 0;
        for(int i = 0; i < oldArray.length; i++){
            if(i == index){
                continue;
            }else{
                newArray[newArrayCounter] = oldArray[i];
                newArrayCounter += 1;
            }
        }
        array = newArray;
        pointer = pointer - 1;
        return value;
    }

    public int indexOf(int numberValue){
        if(array.length == 0){
            return -1;
        }

        for(int i = 0; i< array.length; i++){
            if(array[i] == numberValue){
                return i;
            }
        }

        return -1;
    }

    public void printArray()
    {
        for(int i = 0; i < pointer; i++){
            System.out.println(array[i]);
        }
    }


//    requirements
//    an array class with the following methods:
    // insert()
    // removeAt() remove the item given his index
    // indexOf() show the value given an index
    // print
}
