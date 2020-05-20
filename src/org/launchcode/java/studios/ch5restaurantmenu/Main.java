package org.launchcode.java.studios.ch5restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem(0, "Steak", "tasty", 9.99, new Category("Dinner"),false));
        menuItems.add(new MenuItem(1, "Tacos", "awesome", 3.99, new Category("Lunch"),true));
        menuItems.add(new MenuItem(2, "Pie", "flaky crust", 1.99, new Category("Dessert"),false));

        Menu menu = new Menu("David's Menu", new Date(), menuItems);

        menu.addMenuItem((new MenuItem(3, "Ice Cream", "vanilla", 2.99, new Category("Dessert"),true)));

        System.out.println("Here is the menu:");
        menu.printAllMenu();
        System.out.println("============");
        menu.printSingleMenu(2);
        menu.deleteMenuItem(2);
        System.out.println("===========");
        menu.printAllMenu();
        System.out.println("===========");
        System.out.println(menu.getLastModified());

    }
}
