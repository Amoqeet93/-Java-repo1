package records.recordsWithArrayLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MenuItem menuItem = new MenuItem("Cheese Burger", 5.00);
        ArrayList<MenuItem> menuItemsList = new ArrayList<>();
        menuItemsList.add(menuItem);

        Menu menu = new Menu("Burgers Menu", menuItemsList);

        for(MenuItem menuItemList : menu.menuItem()){
            System.out.print("The burger is: " + menuItemList.itemName() + " and the price is: ");
            System.out.printf("%.2f%n",menuItemList.price());
        }

        System.out.println(menu);

    }
}

record Menu(String menuName, ArrayList<MenuItem> menuItem){}

record MenuItem(String itemName, double price){}
