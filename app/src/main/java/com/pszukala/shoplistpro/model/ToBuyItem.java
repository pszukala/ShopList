package com.pszukala.shoplistpro.model;

/**
 * Created by Gohan on 2016-12-15.
 */
public class ToBuyItem {
    public String name;
    public double amount;
    public String unit;

    public ToBuyItem(){}

    public ToBuyItem (String n, double amt,String unit)
    {
        name = n;
        amount = amt;
        this.unit = unit;
    }
}
