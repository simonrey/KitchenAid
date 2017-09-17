package com.KitchenAidTools.Items;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by simon on 9/16/2017.
 */

public abstract class Item implements ItemInt {

    private Calendar purchaseDate;
    private String itemName;
    private int quantityPurchased;

    @Override
    public void setPurchaseDate(Calendar instance) {
        this.purchaseDate = instance;
    }

    @Override
    public void setName() {

    }

    @Override
    public void setQuantityPurchased() {

    }

    @Override
    public Date getPurchaseDate() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getQuantityPurchased() {
        return 0;
    }
}
