package com.example.user.lists.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.lists.R;
import com.example.user.lists.ViewPagerActivity;
import com.example.user.lists.models.ViewPagerModel;

import java.util.ArrayList;

/**
 * Created by User on 10/8/2016.
 */

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    ArrayList<ViewPagerModel> arraylistmain;
    TextView title, desc;
    ImageView imageView;


    public ViewPagerAdapter(ViewPagerActivity mainactivity, ArrayList<ViewPagerModel> arraylist) {
        this.context = mainactivity;
        this.arraylistmain = arraylist;
    }

    @Override
    public int getCount() {
        return arraylistmain.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.activity_viewpager_item, container, false);
        title = (TextView) layout.findViewById(R.id.viewpager_title);
        desc = (TextView) layout.findViewById(R.id.viewpager_description);
        imageView = (ImageView) layout.findViewById(R.id.viewpager_image);

        ViewPagerModel model = arraylistmain.get(position);
        title.setText(model.getTitle());
        desc.setText(model.getDesc());
        imageView.setImageResource(model.getImage());
        container.addView(layout);
        return layout;
    }

    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
