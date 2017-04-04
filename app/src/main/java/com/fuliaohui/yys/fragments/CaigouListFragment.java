package com.fuliaohui.yys.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fuliaohui.yys.CaigouDetailActivity;
import com.fuliaohui.yys.R;

/**
 * Created by lam on 2017/4/4.
 */

public class CaigouListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_caigou_list, null);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CaigouDetailActivity.class);
                startActivity(intent);
            }
        };

        int[] ids = new int[] { R.id.ll_caigou_1, R.id.ll_caigou_2, R.id.ll_caigou_3, R.id.ll_caigou_4, R.id.ll_caigou_5 };
        for (int id : ids) {
            view.findViewById(id).setOnClickListener(listener);
        }
        return view;
    }
}
