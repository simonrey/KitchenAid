package com.KitchenAidTools;

import com.KitchenAidTools.Items.Item;

import java.util.ArrayList;

public abstract class FoodStorage {

    private String Name;
    private String Location;
    private boolean isMain;
    private ArrayList<Item> Foodstuffs;

    protected String getName() {
        return Name;
    }

    protected void setName(String name) {
        Name = name;
    }

    protected String getLocation() {
        return Location;
    }

    protected void setLocation(String location) {
        Location = location;
    }

    protected boolean isMain() {
        return isMain;
    }

    protected void setMain(boolean main) {
        isMain = main;
    }

    protected ArrayList makeShoppingList(){

        return new ArrayList();
    }

    protected void createNewFoodStorage(){
        this.Foodstuffs = new ArrayList<>();
    }

    public void addItem(Item newItem){
        this.Foodstuffs.add(newItem);
    }

    public void removeItem(Item toRemove){
        this.Foodstuffs.remove(toRemove);
    }

    protected ArrayList sortByPurchase(){
        return new ArrayList();
    }

}
