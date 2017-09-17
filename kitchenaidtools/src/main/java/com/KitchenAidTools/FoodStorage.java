package com.KitchenAidTools;

import com.KitchenAidTools.Items.Item;

import java.util.ArrayList;

public abstract class FoodStorage {

    private String Name;
    private String Location;
    private boolean isMain;
    private ArrayList<Item> Foodstuffs;

    /**
     *
     * @return
     */
    protected String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    protected void setName(String name) {
        Name = name;
    }

    /**
     *
     * @return
     */
    protected String getLocation() {
        return Location;
    }

    /**
     *
     * @param location
     */
    protected void setLocation(String location) {
        Location = location;
    }

    /**
     *
     * @return
     */
    protected boolean isMain() {
        return isMain;
    }

    /**
     *
     * @param main
     */
    protected void setMain(boolean main) {
        isMain = main;
    }

    /**
     * @Description
     * This creates a shopping list to display on phone while user is at the store
     *
     * @return
     */
    protected ArrayList MakeShoppingList(){

        return new ArrayList();
    }

    /**
     *
     */
    protected void CreateNewFoodStorage(){
        this.Foodstuffs = new ArrayList<>();
    }

    /**
     * @Description
     * This is to add an item to the users fridge
     *
     */
    protected void AddItem(Item newItem){
        this.Foodstuffs.add(newItem);
    }

    /**
     *
     * 
     */
    protected void RemoveItem(Item toRemove){
        this.Foodstuffs.remove(toRemove);
    }

    /**
     *
     * @return
     */
    protected ArrayList SortByPurchase(){
        return new ArrayList();
    }

}
