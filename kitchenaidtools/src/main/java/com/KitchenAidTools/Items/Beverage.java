package com.KitchenAidTools.Items;

import com.KitchenAidTools.Enums.BeverageType;
import com.KitchenAidTools.Enums.Packaging;

import java.util.Calendar;

class Beverage extends Item {
    private Packaging packaging;
    private BeverageType beverageType;


    Beverage(Packaging pack, BeverageType type, String beverageName, int beverageQuantityPurchased){
        setItemPurchaseDate(Calendar.getInstance());
        setPackaging(pack);
        setBeverageType(type);
        setItemName(beverageName);
        setItemQuantityPurchased(beverageQuantityPurchased);
    }

    private void setPackaging(Packaging packaging){this.packaging=packaging;}
    Packaging getPackaging(){return this.packaging;}

    private void setBeverageType(BeverageType type){this.beverageType=type;}
    BeverageType getBeverageType(){return this.beverageType;}

}
