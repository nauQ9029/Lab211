package control;

import menu.Menu;
import model.LinearSearchModel;
import view.LinearSearchView;
import view.QuickSortView;


public class LinearSearchController {
    public void displayMenu(Menu menu) {
        
        LinearSearchView dis = new LinearSearchView();
        LinearSearchModel ln = new LinearSearchModel(menu.getArray());
        
        int searchValue = ln.linearSearch(dis.getSearchValue());
        if(searchValue == -1)
                System.out.println("The number not found");
                       
    }
}
