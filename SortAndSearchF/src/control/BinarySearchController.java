package control;

import model.BinarySearchModel;
import view.BinarySearchView;
import menu.Menu;

public class BinarySearchController {
    private BinarySearchModel model;
    private BinarySearchView view;
    
    public BinarySearchController(BinarySearchModel model, BinarySearchView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(Menu menu) {
        int searchNumber;
        
         model = new BinarySearchModel(menu.getArray());    // Get the array from menu
         
        int[] sortedArray = model.sortArray();              // Sort the array

        view.displaySortedArray(sortedArray);               // Get and display the sorted array
        
        searchNumber = view.promptForSearchNumber();

        int index = model.findIndex(searchNumber);

        view.displayIndex(index);
    
    }
    
}
