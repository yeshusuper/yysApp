package com.fuliaohui.yys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.fuliaohui.yys.fragments.CaigouListFragment;
import com.fuliaohui.yys.fragments.OrderListFragment;
import com.fuliaohui.yys.widget.TitleBar;

public class CaigouListActivity extends AppCompatActivity {

    private final static int MODE_CAIGOU = 0;
    private final static int MODE_ORDER = 1;

    private TitleBar titleBar;
    private CaigouListFragment caigouListFragment;
    private OrderListFragment orderListFragment;
    private CheckBox cbCaigou;
    private CheckBox cbOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caigou_list);

        titleBar = (TitleBar) findViewById(R.id.title_bar);
        titleBar.setRigthPlusVisibled(true);

        cbCaigou = (CheckBox) findViewById(R.id.cb_caigou);
        cbOrder = (CheckBox) findViewById(R.id.cb_order);
        caigouListFragment = new CaigouListFragment();
        orderListFragment = new OrderListFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fl_container, caigouListFragment)
                .add(R.id.fl_container, orderListFragment)
                .commit();


        cbCaigou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMode(MODE_CAIGOU);
            }
        });
        cbOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMode(MODE_ORDER);
            }
        });
        setMode(MODE_CAIGOU);
    }

    private void setMode(int mode){
        switch (mode){
            case MODE_CAIGOU:
                titleBar.setTitle("采购列表");
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(orderListFragment)
                        .show(caigouListFragment)
                        .commit();
                cbCaigou.setTextColor(getResources().getColor(R.color.white_ffffff));
                cbCaigou.setBackgroundColor(getResources().getColor(R.color.red_e82c1d));
                cbOrder.setTextColor(getResources().getColor(R.color.gray_999999));
                cbOrder.setBackgroundColor(getResources().getColor(R.color.white_f8f8f8));
                break;
            case MODE_ORDER:
                titleBar.setTitle("订单列表");
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(caigouListFragment)
                        .show(orderListFragment)
                        .commit();
                cbCaigou.setTextColor(getResources().getColor(R.color.gray_999999));
                cbCaigou.setBackgroundColor(getResources().getColor(R.color.white_f8f8f8));
                cbOrder.setTextColor(getResources().getColor(R.color.white_ffffff));
                cbOrder.setBackgroundColor(getResources().getColor(R.color.red_e82c1d));
                break;
        }
    }
}
