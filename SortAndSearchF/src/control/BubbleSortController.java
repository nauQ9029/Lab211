package control;

import java.util.Scanner;
import menu.Menu;
import model.BubbleSortModel;
import view.BubbleSortView;
import view.QuickSortView;


public class BubbleSortController {
    Scanner sc = new Scanner(System.in);

    private BubbleSortModel model;
    private BubbleSortView view;

    public BubbleSortController(BubbleSortModel model, BubbleSortView view) {
        this.model = model;
        this.view = view;
    }

    public void generateAndSortArray() {
        view.getArraySize();
        int size = view.getsize();  
        int[] array = new int[size];

        model.setArray(array);

        view.displayUnsortedArray(array);

        model.sortArray();

        int[] sortedArray = model.getArray();
        
        view.displaySortedArray(sortedArray);
    }
    
    public void displayMenu(Menu menu){
        
        BubbleSortModel model = new BubbleSortModel();
        BubbleSortView view = new BubbleSortView();
        QuickSortView dis = new QuickSortView();
        
        
        System.out.println("Unsorted array: ");
        dis.display(menu.getArray());

        model.setArray(menu.getArray());
        model.sortArray();

        System.out.println("Sorted array: ");
        dis.display(menu.getArray());
    }
}
