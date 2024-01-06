package control;

import menu.Menu;
import model.QuickSortModel;
import view.QuickSortView;


public class QuickSortController {
    
    public void displayMenu(Menu menu){
        
        QuickSortModel model = new QuickSortModel();
        QuickSortView view = new QuickSortView();
        
        int arraySize = menu.getArraySize();
        
        System.out.println("Unsorted array: ");
        view.display(menu.getArray());

        model.setArray(menu.getArray());
        model.quickSort(0, arraySize - 1, menu.getArray());

        System.out.println("Sorted array: ");
        view.display(menu.getArray());
    }
}
