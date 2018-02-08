package com.example.user.lists;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 10/8/2016.
 */

public class ExpandableActivity extends FragmentActivity {
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> HeaderDataList;
    HashMap<String,List<String>> ChildDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_view);
        expandableListView = (ExpandableListView)findViewById(R.id.expandable_view);
        Data();
        expandableListAdapter = new com.example.user.lists.adapters.ExpandableListAdapter(this,HeaderDataList,ChildDataList);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                String name = ChildDataList.get(HeaderDataList.get(groupPosition)).get(childPosition);
                if(name.equals("The Godfather")){
                    Toast.makeText(ExpandableActivity.this,"This is The God Father",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ExpandableActivity.this,"This is not The God Father",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }

    private void Data(){

        HeaderDataList = new ArrayList<String>();
        ChildDataList = new HashMap<String, List<String>>();

        // Adding child data
        HeaderDataList.add("Top 250");
        HeaderDataList.add("Now Showing");
        HeaderDataList.add("Coming Soon..");

        List<String> top250 = new ArrayList<String>();
        top250.add("Hello");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");



        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        ChildDataList.put(HeaderDataList.get(0),top250);
        ChildDataList.put(HeaderDataList.get(1),nowShowing);
        ChildDataList.put(HeaderDataList.get(2),comingSoon);
    }
}

