package com.wisdom.glidedemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wisdom.glidedemo.R;
import com.wisdom.glidedemo.base.BaseRecyclerAdapter;
import com.wisdom.glidedemo.base.DefaultHolder;
import com.wisdom.glidedemo.bean.User;

import butterknife.Bind;

/**
 * Created by 朱志强 on 2018/2/12.
 */

public class UserAdapter extends BaseRecyclerAdapter<User> {

    @Override
    public DefaultHolder<User> setViewHolder(ViewGroup parent) {
        return new UserHolder(parent.getContext(), parent);

    }

    class UserHolder extends DefaultHolder<User> {

        @Bind(R.id.text)
        TextView tv_info;

        public UserHolder(Context context, ViewGroup root) {
            super(context, root, R.layout.item_activity_recyclerview);
        }

        @Override
        public void bindData(User photo) {
            tv_info.setText(photo.name);
            tv_info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    ToastUtil.show("item clicked!");
                }
            });
        }
    }
}
