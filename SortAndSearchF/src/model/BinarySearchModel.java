package model;

import java.util.Arrays;

public class BinarySearchModel {
    private int[] array;
    
    public int[] sortArray() {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
    
    public BinarySearchModel(int[] array) {
        this.array = array;
    }
    
    public int[] getArray() {
        return array;
    }
    
    public int findIndex(int searchNumber) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;    // Find the mid value
            
            if (array[mid] == searchNumber) {       // Mid = keyValue
                return mid;
            }

            if (array[mid] < searchNumber) {        
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }
    
}
