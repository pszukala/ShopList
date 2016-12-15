package com.pszukala.shoplistpro.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Gohan on 2016-12-15.
 */
public class PurchaseHistoryItem {
    public Date purchaseDate;
    public double price;
    public List<BoughtItem> boughtItems;

    public PurchaseHistoryItem(Date pDate, List<BoughtItem> bItems)
    {
        purchaseDate = pDate;
        boughtItems = bItems;
        price = 0;
        for (BoughtItem item : boughtItems) {
            price += item.price;
        }
    }
}
