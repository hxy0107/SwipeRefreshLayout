package com.hxy.SwipeRefreshLayout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {
    private SwipeRefreshLayout swipeLayout;
    private ListView listView;
    private ListViewAdapter adapter;
    private ArrayList<SoftwareClassificationInfo> list;



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        swipeLayout=(SwipeRefreshLayout)findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(this);
        swipeLayout.setColorScheme(android.R.color.holo_blue_bright, android.R.color.holo_green_light,
                android.R.color.holo_orange_light, android.R.color.holo_red_light);
        list=new ArrayList<SoftwareClassificationInfo>();
        list.add(new SoftwareClassificationInfo(1,"asds"));
        listView=(ListView)findViewById(R.id.list);
        adapter=new ListViewAdapter(this,list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeLayout.setRefreshing(false);
                list.add(new SoftwareClassificationInfo(2,"ass"));
                adapter.notifyDataSetChanged();
            }
        },1000);
    }
}
