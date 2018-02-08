package com.example.user.lists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.user.lists.adapters.ListViewAdapter;
import com.example.user.lists.models.ListModel;

import java.util.ArrayList;

/**
 * Created by User on 10/8/2016.
 */

public class ListViewActivity extends AppCompatActivity {
    ListViewAdapter listViewAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_listview);
        listView = (ListView)findViewById(R.id.listview);
        Data();
    }



    public void Data() {

        ArrayList<ListModel> arrayList = new ArrayList<ListModel>();
        for(int i=0;i<10;i++){
            ListModel model1 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
            arrayList.add(model1);


        }

//            ListModel model1 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//            arrayList.add(model1);
//        ListModel model2 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//        arrayList.add(model2);
//        ListModel model3 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//        arrayList.add(model3);
//        ListModel model4 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//        arrayList.add(model4);
//        ListModel model5 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//        arrayList.add(model5);
//        ListModel model6 = new ListModel("Hello","Description",R.mipmap.ic_launcher);
//        arrayList.add(model6);

        ListViewAdapter listViewAdapter = new ListViewAdapter(ListViewActivity.this,arrayList);
        listViewAdapter.notifyDataSetChanged();
        listView.setAdapter(listViewAdapter);




    }




    }

