package blatt27_aufgabe01;

public class DynArray {
    //a
    private int[] array;
    private int size;

    public DynArray(int size) {
        this.size = size;
        array = new int[size];
    }

    //b
    public void printArr(){
        blatt07.ArbeitMitArrays.printArray(array);
    }

    //c
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    //d
    public int size(){
        return size;
    }

    //e
    public int get(int size){
        try{
            return array[size];
        }catch(ArrayIndexOutOfBoundsException e){
            return 0;
        }
    }

    //f
    public boolean contains(int index) {
        try {
            return array[index] != 0;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        return false;
    }

}
