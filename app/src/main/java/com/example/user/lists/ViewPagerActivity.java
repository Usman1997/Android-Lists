package com.example.user.lists;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.user.lists.adapters.ViewPagerAdapter;
import com.example.user.lists.models.ViewPagerModel;

import java.util.ArrayList;

/**
 * Created by User on 10/8/2016.
 */

public class ViewPagerActivity extends AppCompatActivity {
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        viewPager = (ViewPager)findViewById(R.id.viewpager);

        ArrayList<ViewPagerModel> arrayList = new ArrayList<ViewPagerModel>();
        for(int i=0;i<10;i++){
            ViewPagerModel item = new ViewPagerModel("Title","Desc",R.mipmap.ic_launcher);
//            ViewPagerModel item = new ViewPagerModel(1,"aba","aca","adc","add");
            arrayList.add(item);
        }
        viewPagerAdapter = new ViewPagerAdapter(ViewPagerActivity.this,arrayList);
        viewPagerAdapter.notifyDataSetChanged();
        viewPager.setAdapter(viewPagerAdapter);

    }
}
