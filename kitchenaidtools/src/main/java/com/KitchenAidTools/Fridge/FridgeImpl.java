package com.KitchenAidTools.Fridge;

import com.KitchenAidTools.FoodStorage;

public class FridgeImpl extends FoodStorage {

    public void Fridge(String Name, String Location, boolean isMain){
        setName(Name);
        setLocation(Location);
        setMain(isMain);
        CreateNewFoodStorage();
    }

    public void Fridge(){
        String myFridge = "My Fridge";
        setName(myFridge);
        setLocation(myFridge);
        setMain(true);
        CreateNewFoodStorage();
    }
}
