package com.example.zihua.slidingtablayout;

import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.zihua.adapter.TabsAdapter;
import com.example.zihua.fargment.HomeFragment;
import com.example.zihua.fargment.TopicListFrag;
import com.example.zihua.fargment.WorksListFragment;
import com.example.zihua.widget.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm = getSupportFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(android.R.id.content, HomeFragment.newInstance());
            ft.commit();
        }
    }

}
