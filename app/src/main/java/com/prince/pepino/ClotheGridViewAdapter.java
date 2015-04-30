package com.prince.pepino;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eit on 4/28/15.
 */
public class ClotheGridViewAdapter extends BaseAdapter {
    String[] clotheResult;
    Context clotheContext;
    String[] clothePrice;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public ClotheGridViewAdapter(ClotheActivity clotheActivity, String[]clotheMainList, String[]clothePriceList, int[]clotheMainIcons){
        //TODO Auto-generated constructor stub
        clotheResult = clotheMainList;
        clotheContext = clotheActivity;
        clothePrice = clothePriceList;
        imageId = clotheMainIcons;
        inflater = (LayoutInflater)clotheContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return clotheResult.length;
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
            convertView = inflater.inflate(R.layout.clothe_grid_item, null);
            holder.tv=(TextView) convertView.findViewById(R.id.clotheTextView);
            holder.pv=(TextView) convertView.findViewById(R.id.clothePriceView);
            holder.img=(ImageView) convertView.findViewById(R.id.clotheImageView);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }


        holder.tv.setText(clotheResult[position]);
        holder.pv.setText(clothePrice[position]);
        holder.img.setImageResource(imageId[position]);

        return convertView;
    }
}
