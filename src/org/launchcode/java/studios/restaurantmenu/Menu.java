package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private String date;

    public Menu() {
    }

    public Menu(ArrayList<MenuItem> menuItems, String date) {
        this.menuItems = menuItems;
        this.date = date;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
