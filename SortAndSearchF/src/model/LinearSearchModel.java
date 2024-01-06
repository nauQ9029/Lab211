package model;

import java.util.Scanner;

public class LinearSearchModel {
    private int[] array;
    Scanner sc = new Scanner(System.in);

    public int linearSearch(int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("Found " + array[i] + " at index " + i);
                return i;
            }
        }
        return -1;
    }
    
    public LinearSearchModel(int[] array) {
        this.array = array;
    }
    
}
