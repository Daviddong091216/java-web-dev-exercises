package org.launchcode.java.studios.restaurantmenu;


import java.util.ArrayList;

public class MenuItem {
    private double price;
    private String description;
    private ArrayList<Category> category;
    private boolean isNew;

    public MenuItem() {
    }

    public MenuItem(double price, String description,
                    ArrayList<Category> category,
                    boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Category> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<Category> category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

}
