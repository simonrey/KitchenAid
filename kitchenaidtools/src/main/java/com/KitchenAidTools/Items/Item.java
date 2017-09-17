package com.KitchenAidTools.Items;
import com.KitchenAidTools.FoodStorage;

import java.util.Calendar;

/**
 * Created by simon on 9/16/2017.
 */

public abstract class Item implements ItemInt {

    private Calendar itemPurchaseDate;
    private String itemName;
    private int itemQuantityPurchased;

    @Override
    public void setItemPurchaseDate(Calendar instance) {this.itemPurchaseDate = instance;}

    @Override
    public void setItemName(String name) {this.itemName = name;}

    @Override
    public void setItemQuantityPurchased(int quantityPurchased) {this.itemQuantityPurchased = quantityPurchased;}

    @Override
    public Calendar getItemPurchaseDate() {return this.itemPurchaseDate;}

    @Override
    public String getItemName() {return this.itemName;}

    @Override
    public int getItemQuantityPurchased() {return this.itemQuantityPurchased;}

    @Override
    public void addToStorage(FoodStorage foodStorage) {foodStorage.addItem(this);}
}
