package com.wisdom.glidedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wisdom.glidedemo.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 朱志强 on 2018/2/11.
 */

public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<String> mStringList=new ArrayList<>();

    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        for (int i=0;i<8;i++){
            mStringList.add("item"+(i+1));
        }


        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(new RecyclerViewAdapter(mStringList));
    }
}
