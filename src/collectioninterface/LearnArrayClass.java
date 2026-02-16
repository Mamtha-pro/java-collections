package collectioninterface;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4);

       // System.out.println("The index of element 4 in the array is " + index);
        Arrays.sort(numbers);

        //8192 parallel sort

        Arrays.fill(numbers,12);//every it will fill 12

        for(int i : numbers){
            System.out.println(i + " ");
        }
    }


}
