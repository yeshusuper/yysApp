package com.fuliaohui.yys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.fuliaohui.yys.widget.TitleBar;

public class FaHuoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fa_huo);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("填写发货信息");
        titleBar.setActivity(this);

        final ImageView ivTypeSelect = (ImageView) findViewById(R.id.iv_type_1);
        final ImageView ivTypeEdit = (ImageView) findViewById(R.id.iv_type_2);
        final View llSelect = findViewById(R.id.ll_select_express);
        final View llEdit = findViewById(R.id.ll_edit_express);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivTypeSelect.setImageResource(R.drawable.icon_check_bor_cur);
                ivTypeEdit.setImageResource(R.drawable.icon_check_bor_nor);
                llSelect.setVisibility(View.VISIBLE);
                llEdit.setVisibility(View.GONE);
            }
        };

        findViewById(R.id.ll_type_1).setOnClickListener(listener);
        findViewById(R.id.ll_type_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivTypeEdit.setImageResource(R.drawable.icon_check_bor_cur);
                ivTypeSelect.setImageResource(R.drawable.icon_check_bor_nor);
                llSelect.setVisibility(View.GONE);
                llEdit.setVisibility(View.VISIBLE);
            }
        });
        listener.onClick(null);
    }
}
