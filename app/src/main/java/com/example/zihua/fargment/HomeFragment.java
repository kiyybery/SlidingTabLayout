package com.example.zihua.fargment;

import android.app.Activity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zihua.adapter.TabsAdapter;
import com.example.zihua.slidingtablayout.R;
import com.example.zihua.widget.SlidingTabLayout;

/**
 * Created by zihua on 2015/9/11.
 */
public class HomeFragment extends Fragment {

    private SlidingTabLayout mSlidingTabLayout;
    private TabsAdapter mTabsAdapter;
    private ViewPager mViewPager;
    private FragmentManager fm;

    private WorksListFragment worksListFragment;
    private TopicListFrag topicListFrag;

    public static HomeFragment newInstance() {
        HomeFragment f = new HomeFragment();
        
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        worksListFragment = new WorksListFragment();
        topicListFrag = new TopicListFrag();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        fm = getChildFragmentManager();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main,container,false);
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewPager = (ViewPager)view.findViewById(R.id.discover_fragment_container);
        mViewPager.setOffscreenPageLimit(5);
        mViewPager.setPageMargin(5);//??

        mTabsAdapter = new TabsAdapter(fm);
        mViewPager.setAdapter(mTabsAdapter);

        mTabsAdapter.addTab("关注", worksListFragment, 0);//
        mTabsAdapter.addTab("话题", topicListFrag, 1);//

        mSlidingTabLayout =
                (SlidingTabLayout) view.findViewById(R.id.discover_sliding_tabs);
        mSlidingTabLayout.setCustomTabView(R.layout.tab_indicator_tint_bottom, R.id.tab_text_title);

        Resources res = getResources();
        mSlidingTabLayout.setSelectedIndicatorColors(
                res.getColor(R.color.zihua_main_orange));

        mSlidingTabLayout.setDistributeEvenly(true);
        mSlidingTabLayout.setViewPager(mViewPager);
    }
}
