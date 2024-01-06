package model;

public class BubbleSortModel {
    
    private int[] array;
    public void setArray(int[] array) {
        this.array = array;
    }
    
    public int[] getArray() {
        return array;
    }
    public void sortArray() {
        int n = array.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    
}
