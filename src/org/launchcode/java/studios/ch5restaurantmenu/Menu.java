package org.launchcode.java.studios.ch5restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date lastModified;
    private ArrayList<MenuItem> menuItems;

    public Menu(String name, Date lastModified, ArrayList<MenuItem> menuItems) {
        this.name = name;
        this.lastModified = lastModified;
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public void deleteMenuItem(int index){
        menuItems.remove(index);
    }
    public Date getLastModified(){
        return lastModified;
    }


    public void printSingleMenu(int index){
        System.out.println(menuItems.get(index));
    }
    public void printAllMenu(){
        System.out.println(name);
//        System.out.println("Last Modified: "+ lastModified.toString());
        for (MenuItem menuItem: menuItems ) {
            System.out.println(menuItem);
        }
    }


}
