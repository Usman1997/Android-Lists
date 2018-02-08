package com.example.user.lists.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.lists.R;
import com.example.user.lists.models.ListModel;

import java.util.ArrayList;

/**
 * Created by User on 10/8/2016.
 */

public class ListViewAdapter extends BaseAdapter {
    Activity mainActivitymain;
    ArrayList<ListModel> arrayListmain;
    TextView title,desc;
    ImageView imageView;
    LayoutInflater inflater;


 public ListViewAdapter(Activity mainActivity,ArrayList<ListModel> arrayList){
     mainActivitymain = mainActivity;
     arrayListmain=arrayList;
     inflater = (LayoutInflater)mainActivitymain.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 }

    @Override
    public int getCount() {
        return arrayListmain.size();
    }

    @Override
    public ListModel getItem(int position) {
        return arrayListmain.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_listview_item,null);
        title = (TextView)convertView.findViewById(R.id.listview_title);
        desc = (TextView)convertView.findViewById(R.id.listview_desc);
        imageView = (ImageView) convertView.findViewById(R.id.listview_image);
        ListModel listModel =getItem(position);

        title.setText(listModel.getTitle());
        desc.setText(listModel.getDescription());
        imageView.setImageResource(listModel.getImage());
        return convertView;


    }




}
