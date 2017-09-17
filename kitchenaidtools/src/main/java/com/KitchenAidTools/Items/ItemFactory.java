package com.KitchenAidTools.Items;

import com.KitchenAidTools.Enums.BeverageType;
import com.KitchenAidTools.Enums.ItemTypes;
import com.KitchenAidTools.Enums.Packaging;

/**
 * Created by simon on 9/16/2017.
 */

public final class ItemFactory {

    private static Item MakeItem(Enum itemType, String itemName, int itemQuantityPurchased){
        if(itemType.equals(ItemTypes.FRUIT)){return new Fruit();}
        if(itemType.equals(ItemTypes.VEG)){return new Vegetable();}
        if(itemType.equals(ItemTypes.MEAT)){return new Meat();}
        if(itemType.equals(ItemTypes.SNACK)){return new Snack();}
        else return null;
    }

    private static Item MakeBeverage(String beverageName, int beverageQuantityPurchased,
                                     Packaging packaging, BeverageType type){
        return new Beverage(packaging, type, beverageName, beverageQuantityPurchased);
    }

}
