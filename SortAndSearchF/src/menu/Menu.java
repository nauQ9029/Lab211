package menu;

import control.BubbleSortController;
import control.LinearSearchController;
import java.util.Scanner;
import control.QuickSortController;
import model.BubbleSortModel;
import view.BubbleSortView;
import control.BinarySearchController;
import model.BinarySearchModel;
import view.BinarySearchView;

public class Menu {

    private int[] array;
    private int size;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~ Sort and Search program ~~~~~~~~~~");
        Menu menu = new Menu();
        menu.enterSize();
        menu.enterArray(menu.getArraySize());
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("_____ Menu _____");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Linear search");
            System.out.println("4. Binary search");
            System.out.println("5. Re-enter array");
            System.out.println("6. Exit");
            System.out.print("  Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menu.bubbleSort();
                    break;
                case 2:
                    menu.quickSort();
                    break;
                case 3:
                    menu.linearSearch();
                    break;
                case 4:
                    menu.binarySearch();
                    break;
                case 5:
                    menu.enterSize();
                    menu.enterArray(menu.getArraySize());
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    public int[] getArray() {
        return array;
    }

    public int getArraySize() {
        return size;
    }

    public int enterSize() {
        System.out.print("Enter the number of array : ");
        size = sc.nextInt();
        return size;
    }

    public void enterArray(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("The " + i + " is ");
            array[i] = sc.nextInt();
        }
    }

    public void quickSort() {
        QuickSortController control = new QuickSortController();
        control.displayMenu(this);
    }

    public void bubbleSort() {
        BubbleSortModel model = new BubbleSortModel();
        BubbleSortView view = new BubbleSortView();
        BubbleSortController control = new BubbleSortController(model, view);
        control.displayMenu(this);
    }

    public void linearSearch() {
        LinearSearchController control = new LinearSearchController();
        control.displayMenu(this);
    }

    public void binarySearch() {
        Menu menu = new Menu();
        BinarySearchModel model = new BinarySearchModel(menu.getArray());
        BinarySearchView view = new BinarySearchView();
        BinarySearchController control = new BinarySearchController(model, view);
        control.run(this);
    }

}
