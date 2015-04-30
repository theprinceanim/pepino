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
public class BagsGridViewAdapter extends BaseAdapter {
    String[] bagResult;
    Context  bagContext;
    String[] bagPrice;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public BagsGridViewAdapter(BagsActivity bagActivity, String[]bagMainList, String[]bagPriceList, int[]bagMainIcons){
        //TODO Auto-generated constructor stub
        bagResult = bagMainList;
        bagContext = bagActivity;
        bagPrice = bagPriceList;
        imageId = bagMainIcons;
        inflater = (LayoutInflater)bagContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return bagResult.length;
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
            convertView = inflater.inflate(R.layout.bag_grid_item, null);
            holder.tv=(TextView) convertView.findViewById(R.id.bagTextView);
            holder.pv=(TextView) convertView.findViewById(R.id.bagPriceView);
            holder.img=(ImageView) convertView.findViewById(R.id.bagImageView);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }


        holder.tv.setText(bagResult[position]);
        holder.pv.setText(bagPrice[position]);
        holder.img.setImageResource(imageId[position]);

        return convertView;
    }
}
