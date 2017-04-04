package com.fuliaohui.yys.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.fuliaohui.yys.R;

/**
 * Created by lam on 2017/4/4.
 */

public class OrderListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_list, null);

        final View vSelectItems = view.findViewById(R.id.ll_select_items);

        view.findViewById(R.id.ll_select_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vSelectItems.setVisibility(View.VISIBLE);
            }
        });
        vSelectItems.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                vSelectItems.setVisibility(View.GONE);
                return false;
            }
        });

        View.OnClickListener talkListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2017/4/4 跳转到聊天
            }
        };

        int[] talkIds = new int[]{ R.id.cb_talk_1, R.id.cb_talk_2, R.id.cb_talk_3, R.id.cb_talk_4 };
        for (int talkId : talkIds) {
            view.findViewById(talkId).setOnClickListener(talkListener);
        }

        return view;
    }
}
