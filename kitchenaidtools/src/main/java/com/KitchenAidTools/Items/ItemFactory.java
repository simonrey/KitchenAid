package com.KitchenAidTools.Items;

import com.KitchenAidTools.Enums.ItemTypes;

/**
 * Created by simon on 9/16/2017.
 */

public final class ItemFactory {

    private static Item MakeItem(Enum itemType){
        if(itemType.equals(ItemTypes.BEVERAGE)) {return new Beverage();}
        if(itemType.equals(ItemTypes.FRUIT)){return new Fruit();}
        if(itemType.equals(ItemTypes.VEG)){return new Vegetable();}
        if(itemType.equals(ItemTypes.MEAT)){return new Meat();}
        if(itemType.equals(ItemTypes.SNACK)){return new Snack();}
        else return null;
    }

}
