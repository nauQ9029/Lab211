package view;

import java.util.Arrays;
import java.util.Scanner;
import menu.Menu;

public class BinarySearchView {
    private Scanner scanner;

    public BinarySearchView() {
        scanner = new Scanner(System.in);
    }


    public int promptForSearchNumber() {
        System.out.print("Enter the search value: ");
        return scanner.nextInt();
    }

    public void displaySortedArray(int[] sortedArray) {
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public void displayIndex(int index) {
        if (index != -1) {
            //int searchN = controller.BinarySearchController;
            System.out.println("Found " + "at index: " + index); //Incompleted
        } else {
            System.out.println("Search number not found in the array.");
        }
    }
}
