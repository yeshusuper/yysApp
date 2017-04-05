package com.fuliaohui.yys;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fuliaohui.yys.widget.TitleBar;

/**
 * Created by lam on 2017/4/5.
 */

public class OrderDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle("订单详情");
        titleBar.setActivity(this);

        findViewById(R.id.btn_fahuo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrderDetailActivity.this, FaHuoActivity.class));
            }
        });

        findViewById(R.id.tv_talk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 2017/4/5 跳转到聊天
            }
        });
    }
}
