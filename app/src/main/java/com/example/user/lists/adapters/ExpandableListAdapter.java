package com.example.user.lists.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.user.lists.R;

import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 10/8/2016.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {



    Context context;
    List<String> groupdatalist;
    HashMap<String, List<String>> itemdatalist;

    public ExpandableListAdapter(Context context, List<String> GroupData, HashMap<String, List<String>> ItemList) {
        this.context = context;
        this.groupdatalist = GroupData;
        this.itemdatalist = ItemList;
    }

    @Override
    public int getGroupCount() {
        return this.groupdatalist.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.itemdatalist.get(this.groupdatalist.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.groupdatalist.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.itemdatalist.get(this.groupdatalist.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String Groupname = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.expandable_group_item, null);

        }
        TextView groupitemname = (TextView) convertView.findViewById(R.id.group_item);
        groupitemname.setText(Groupname);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String Childname = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.expandable_list_item, null);
        }
        TextView itemname = (TextView) convertView.findViewById(R.id.list);
        itemname.setText(Childname);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;

    }
}