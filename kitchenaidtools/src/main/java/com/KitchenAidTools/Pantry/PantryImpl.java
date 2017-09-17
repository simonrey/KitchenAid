package com.KitchenAidTools.Pantry;

import com.KitchenAidTools.FoodStorage;

/**
 * Created by simon on 9/16/2017.
 */

public class PantryImpl extends FoodStorage{

    public PantryImpl(String Name, String Location, boolean isMain) {
        setName(Name);
        setLocation(Location);
        setMain(isMain);
        CreateNewFoodStorage();
    }

    public PantryImpl(){
        String myPantry = "My Pantry";
        setLocation(myPantry);
        setName(myPantry);
        setMain(true);
        CreateNewFoodStorage();
    }


}
