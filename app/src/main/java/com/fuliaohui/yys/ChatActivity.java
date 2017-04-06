package com.fuliaohui.yys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fuliaohui.yys.widget.TitleBar;


/**
 * Created by lam on 2017/3/25.
 */

public class ChatActivity extends AppCompatActivity {

    public static void launchChat(Context context){
        context.startActivity(new Intent(context, ChatActivity.class));
    }

    public static void launchKf(Context context){
        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra("type", 1);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        int type = getIntent().getIntExtra("type", 0);

        TitleBar titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setTitle(type == 0 ? "采购：吴先生" : "客服");
        titleBar.setActivity(this);

        View llQuiteProductContainer = findViewById(R.id.ll_quick_product_container);
        if(type > 0){
            llQuiteProductContainer.setVisibility(View.GONE);
            findViewById(R.id.tv_notify).setVisibility(View.GONE);
        }else{
            llQuiteProductContainer.setVisibility(View.VISIBLE);
            llQuiteProductContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(ChatActivity.this, BaoJiaActivity.class));
                }
            });
            findViewById(R.id.tv_notify).setVisibility(View.VISIBLE);
        }
    }
}