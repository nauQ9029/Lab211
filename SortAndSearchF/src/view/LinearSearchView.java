package view;

import java.util.Scanner;

public class LinearSearchView {
    
    Scanner sc = new Scanner(System.in);
    
    public int getSearchValue(){
        System.out.println("Enter search value: ");
        int search;
        search = sc.nextInt();
        return search;
    }
    
}
