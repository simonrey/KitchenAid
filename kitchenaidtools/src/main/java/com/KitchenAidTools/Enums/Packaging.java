package com.KitchenAidTools.Enums;

public enum Packaging {
    SIX("6 Pack"),
    TWELVE("12 Pack"),
    TWENTYFOUR("24 Pack"),
    FORTYEIGHT("48 Pack"),
    CASE("Case");

    private final String Packing;

    Packaging(String s) {
        this.Packing = s;
    }
}
