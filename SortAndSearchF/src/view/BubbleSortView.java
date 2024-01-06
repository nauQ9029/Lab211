package view;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortView {
    private int sizeBubble;
    Scanner sc = new Scanner(System.in);
    
    public void displayArray(int[] array, String message) {
        System.out.println(message + Arrays.toString(array));
    }
    
    public void displayUnsortedArray(int[] unsortedArray) {
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
    }
    
    public void displaySortedArray(int[] sortedArray) {
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public int getArraySize() {
        System.out.println("Enter the number of array : ");
        sizeBubble = sc.nextInt();
        return sizeBubble;
    }
    
    public int getsize(){
        return sizeBubble;
    }
}
