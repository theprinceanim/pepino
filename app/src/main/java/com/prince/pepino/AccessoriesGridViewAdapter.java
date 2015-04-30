package com.prince.pepino;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eit on 4/27/15.
 */
public class AccessoriesGridViewAdapter extends BaseAdapter {
    String[] accResult;
    Context accContext;
    String[] accPrice;
    int[] imageId;
    private static LayoutInflater inflater = null;

    public AccessoriesGridViewAdapter(AccessoriesActivity accessoriesActivity, String[]accMainList, String[]accPriceList, int[]accMainIcons){
        //TODO Auto-generated constructor stub
        accResult = accMainList;
        accContext = accessoriesActivity;
        accPrice = accPriceList;
        imageId = accMainIcons;
        inflater = (LayoutInflater)accContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return accResult.length;
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
            convertView = inflater.inflate(R.layout.accessories_grid_item, null);
            holder.tv=(TextView) convertView.findViewById(R.id.accTextView);
            holder.pv=(TextView) convertView.findViewById(R.id.accPriceView);
            holder.img=(ImageView) convertView.findViewById(R.id.accImageView);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }


        holder.tv.setText(accResult[position]);
        holder.pv.setText(accPrice[position]);
        holder.img.setImageResource(imageId[position]);

        return convertView;
    }
}
