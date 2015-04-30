package com.prince.pepino;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eit on 4/29/15.
 */
public class ShoeGridViewAdapter extends BaseAdapter {
    String[] shoeResult;
    Context shoeContext;
    String[] shoePrice;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public ShoeGridViewAdapter(ShoeActivity shoeActivity, String[]shoeMainList, String[]shoePriceList, int[]shoeMainIcons){
        //TODO Auto-generated constructor stub
        shoeResult = shoeMainList;
        shoeContext = shoeActivity;
        shoePrice = shoePriceList;
        imageId = shoeMainIcons;
        inflater = (LayoutInflater)shoeContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return shoeResult.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class ViewHolder
    {
        TextView tv;
        TextView pv;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder = null;
        View rowView;
        if(convertView == null){
            holder=new ViewHolder();
            convertView = inflater.inflate(R.layout.shoe_grid_item, null);
            holder.tv=(TextView) convertView.findViewById(R.id.shoeTextView);
            holder.pv=(TextView) convertView.findViewById(R.id.shoePriceView);
            holder.img=(ImageView) convertView.findViewById(R.id.shoeImageView);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }


        holder.tv.setText(shoeResult[position]);
        holder.pv.setText(shoePrice[position]);
        holder.img.setImageResource(imageId[position]);

        return convertView;
    }
}
