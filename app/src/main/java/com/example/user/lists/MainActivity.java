package com.example.user.lists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button expandable,grid,listview,viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandable  =(Button)findViewById(R.id.expandable);
        grid = (Button) findViewById(R.id.gridview);
        listview = (Button)findViewById(R.id.listview);
        viewpager = (Button)findViewById(R.id.viewpager);
        expandable.setOnClickListener(this);
        grid.setOnClickListener(this);
        listview.setOnClickListener(this);
        viewpager.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
      switch (v.getId()) {
          case R.id.expandable:
            i = new Intent(MainActivity.this, ExpandableActivity.class);
              startActivity(i);
              break;

          case R.id.gridview:
              i = new Intent(MainActivity.this, GridActivity.class);
              startActivity(i);
              break;
          case R.id.listview:
              i = new Intent(MainActivity.this, ListViewActivity.class);
              startActivity(i);
              break;
          case R.id.viewpager:
              i = new Intent(MainActivity.this, ViewPagerActivity.class);
              startActivity(i);
              break;

      }
    }
}
