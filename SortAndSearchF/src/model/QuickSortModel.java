package model;

public class QuickSortModel {
    private int[] array;

    public int[] quickSort(int start, int end, int[] array) {
        if (end <= start) return array;
        int pivot = partition(start, end);
        quickSort(start, pivot - 1, array);
        quickSort(pivot + 1, end, array);
        return array;
    }

    private int partition(int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    
    public void setArray(int[] array) {
        this.array = array;
    }
    
    public int[] getArray() {
        return array;
    }
}
