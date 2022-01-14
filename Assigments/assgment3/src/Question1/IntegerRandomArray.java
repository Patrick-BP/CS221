package Question1;


import java.util.Arrays;
import java.util.Random;

public class IntegerRandomArray {

    private final int  INITIAL_CAPACITY = 50;
    private int size = 0;
    private int capacity;
    private int[] arr;

    public IntegerRandomArray() {

        capacity = INITIAL_CAPACITY;
        arr = new int[capacity];
    }

    public void insert(){
        Random rand = new Random();
        int maxRandNum = 50;
        for(int i=0 ; i<maxRandNum; i++) {
            int int_random = rand.nextInt(100);
            arr[i] = int_random;
        }
        size=50;
        System.out.println(Arrays.toString(arr));
        System.out.println("size --->" + arr.length);
    }

    public void removeDuplicates(){

        int capacity2 =arr.length;
        for (int i = 0; i < capacity2; i++) {
            for (int j = i + 1; j < capacity2; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[capacity2-1];
                    capacity2--;
                }
            }
        }
        int[] arr2 = new int[capacity2];
        for (int i = 0; i < capacity2; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("size --->"+ capacity2);

    }


    public void clear(){
        for (int i=0 ; i< arr.length; i++){
            arr[i] = 0;
        }
        size = 0;

        System.out.println(Arrays.toString(arr));
    }

    public int size(){
        return size;
    }


    public int get(int index){
        if(index <0 || index >=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int[] subList(int start, int end){

        if(start < 0 || start >=size || end < 0 || end >=size){
            throw new ArrayIndexOutOfBoundsException();
        }

        int[] arr2 = new int[end-1];
        int e=0;
        for (int i = start; i<=end; i++){

            arr2[e] = arr[i] ;
            e++;
        }
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    public int set(int index, int newValue){
        if(index <0 || index >=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index] = newValue;
        System.out.println(Arrays.toString(arr));
        return arr[index];

    }

}
