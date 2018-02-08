package com.example.user.lists.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.lists.R;

/**
 * Created by User on 10/11/2016.
 */

public class CustomGridViewAdapter extends BaseAdapter {
    Context context;
    String[] mobilevalue;

    public CustomGridViewAdapter(Context context, String[] mobile) {
        this.context = context;
        this.mobilevalue = mobile;
    }

    @Override
    public int getCount() {
        return mobilevalue.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null) {
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.gridview_item, null);
            TextView text = (TextView) gridView.findViewById(R.id.gridview_text);
            text.setText(mobilevalue[position]);
            ImageView image = (ImageView) gridView.findViewById(R.id.gridview_image);
            String mobile = mobilevalue[position];

            if (mobile.equals("Android")) {
                image.setImageResource(R.mipmap.ic_launcher);
            } else if (mobile.equals("Windows")) {
                image.setImageResource(R.mipmap.ic_launcher);
            } else if (mobile.equals("iOS")) {
                image.setImageResource(R.mipmap.ic_launcher);
            } else {
                image.setImageResource(R.mipmap.ic_launcher);
            }
        } else {
                gridView = (View) convertView;
            }


            return gridView;



    }
}
