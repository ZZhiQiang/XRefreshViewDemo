package com.wisdom.glidedemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wisdom.glidedemo.R;
import com.wisdom.glidedemo.XLogger;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by 朱志强 on 2018/2/11.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private boolean enableHead = true;

    private List<String> mStringList = new ArrayList<>();

    public RecyclerViewAdapter(List<String> mStringList) {
        this.mStringList = mStringList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        XLogger.i("sasa........" + viewType);

        int code = getItemViewType(viewType);

        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_activity_recyclerview, parent, false);
        View vs = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_activity_recyclerview_header, parent, false); // 实例化viewholder
        if (code == 0) {
            return new ViewHolder(vs);
        } else {
            return new ViewHolder(v);
        }

//        ViewHolder viewHolder = new ViewHolder(v);
//        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        XLogger.i("getItemViewType..." + position);
        if (enableHead) {
            if (position == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (enableHead) {
            if (position == 0) {

            }else {
                //
                holder.textView.setText(mStringList.get(position-1));
            }
        }



    }

    @Override
    public int getItemCount() {
        if (enableHead) {
            return mStringList == null ? 0 : (mStringList.size() + 1);
        }
        return mStringList == null ? 0 : mStringList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }



}
