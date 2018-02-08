package com.example.user.lists;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.lists.adapters.CustomGridViewAdapter;

/**
 * Created by User on 10/11/2016.
 */

public class GridActivity  extends FragmentActivity {
    GridView gridView;
    String[] mobile = new String[]{"Android", "iOS", "Windows", "Blackberry"};
    CustomGridViewAdapter customGridViewAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        gridView =(GridView)findViewById(R.id.gridview);
        customGridViewAdapter = new CustomGridViewAdapter(GridActivity.this,mobile);
        gridView.setAdapter(customGridViewAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplication(),((TextView)view.findViewById(R.id.gridview_text)).getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}