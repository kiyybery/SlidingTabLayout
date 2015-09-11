package com.example.zihua.fargment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zihua.slidingtablayout.R;

/**
 * Created by zihua on 2015/9/11.
 */
public class TopicListFrag  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.topic_list,container,false);
        return root;
    }
}
