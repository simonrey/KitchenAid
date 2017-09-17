package com.KitchenAidTools.Items;


import java.util.Calendar;
import java.util.Date;

interface ItemInt{

    void setPurchaseDate(Calendar instance);
    void setName();
    void setQuantityPurchased();
    Date getPurchaseDate();
    String getName();
    int getQuantityPurchased();

}
