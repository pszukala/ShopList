package com.pszukala.shoplistpro.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pszukala.shoplistpro.R;
import com.pszukala.shoplistpro.model.ToBuyItem;

import java.util.List;

/**
 * Created by Gohan on 2016-12-15.
 */
public class ToBuyListAdapter extends ArrayAdapter<ToBuyItem> {

    public ToBuyListAdapter(Context context,int resource, List<ToBuyItem> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data name for this position
        ToBuyItem item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.to_buy_row, parent, false);
        }
        // Lookup view for data population
        TextView pName = (TextView) convertView.findViewById(R.id.product_name_to_buy);
        TextView pAmount = (TextView) convertView.findViewById(R.id.amount_to_buy);
        // Populate the data into the template view using the data object
        String amount;
        if(item.unit=="szt")
             amount = String.valueOf((int)(item.amount))+" "+item.unit;
        else
            amount = String.valueOf(item.amount)+" "+item.unit;
        pName.setText(item.name);
        pAmount.setText(amount);
        // Return the completed view to render on screen
        return convertView;
    }
}
