package com.wisdom.glidedemo.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.header.progresslayout.ProgressLayout;
import com.wisdom.glidedemo.R;
import com.wisdom.glidedemo.adapter.UserAdapter;
import com.wisdom.glidedemo.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 朱志强 on 2018/2/12.
 */

public class DemoActivity extends AppCompatActivity {

  private UserAdapter userAdapter;
    RecyclerView recyclerView ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_demo);
        setRecyclerView();
    }

    private void setRecyclerView() {
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter=new UserAdapter();
        recyclerView.setAdapter(userAdapter);

        final TwinklingRefreshLayout refreshLayout = (TwinklingRefreshLayout) findViewById(R.id.refresh);
        ProgressLayout header = new ProgressLayout(this);
        refreshLayout.setHeaderView(header);
//      refreshLayout.setEnableOverScroll(true);
//      refreshLayout.setEnableOverScroll(true);
//      refreshLayout.setOverScrollBottomShow(true);
        refreshLayout.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onRefresh(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshCard();
                        refreshLayout.finishRefreshing();
                    }
                }, 2000);
            }

            @Override
            public void onLoadMore(final TwinklingRefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadMoreCard();
                        refreshLayout.finishLoadmore();
                    }
                }, 2000);
            }
        });

    }

    void refreshCard() {
        List<User> photos = new ArrayList<>();
        photos.add(new User("chest nut", ""));
        photos.add(new User("fish nut", ""));
        photos.add(new User("cat nut", ""));
        photos.add(new User("guitar nut", ""));
        photos.add(new User("common nut", ""));
        photos.add(new User("cherry nut", ""));
        photos.add(new User("flower nut", ""));
        photos.add(new User("tree nut", ""));
        userAdapter.setDataList(photos);
    }

    void loadMoreCard() {
        List<User> photos = new ArrayList<>();
        photos.add(new User("chest nut", ""));
        photos.add(new User("fish nut", ""));
        photos.add(new User("cat nut", ""));
        photos.add(new User("guitar nut", ""));
        photos.add(new User("common nut", ""));
        photos.add(new User("cherry nut", ""));
        photos.add(new User("flower nut", ""));
        photos.add(new User("tree nut", ""));
        userAdapter.addItems(photos);
    }

}
