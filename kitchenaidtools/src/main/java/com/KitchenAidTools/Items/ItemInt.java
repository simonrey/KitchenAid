package com.KitchenAidTools.Items;


import com.KitchenAidTools.FoodStorage;

import java.util.Calendar;

interface ItemInt{

    void setItemPurchaseDate(Calendar instance);
    void setItemName(String name);
    void setItemQuantityPurchased(int quantityPurchased);
    Calendar getItemPurchaseDate();
    String getItemName();
    int getItemQuantityPurchased();

    public void addToStorage(FoodStorage foodStorage);

}
