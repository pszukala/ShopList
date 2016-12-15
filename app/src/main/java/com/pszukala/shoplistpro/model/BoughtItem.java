package com.pszukala.shoplistpro.model;

/**
 * Created by Gohan on 2016-12-15.
 */
public class BoughtItem extends ToBuyItem {
     public double price;

     public BoughtItem(String it, double amt, double pr)
     {
         name = it;
         amount = amt;
         price = pr;
     }
}
