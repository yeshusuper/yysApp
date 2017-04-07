package com.fuliaohui.yys.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.fuliaohui.yys.PublishNewProductActivity;
import com.fuliaohui.yys.R;

/**
 * Created by lam on 2017/3/19.
 */

public class TitleBar extends FrameLayout {
    private TextView tvTitle;
    private Activity activity;
    private View llBack;
    private TextView tvRigthText;
    private PopupWindow moreMenuPopupWindow;

    public TitleBar(Context context) {
        super(context);
        init(context);
    }

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TitleBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        View view = inflate(context, R.layout.widget_title_bar, this);
        tvTitle = (TextView) view.findViewById(R.id.tv_text);
        tvRigthText = (TextView)view.findViewById(R.id.tv_right_text);
        llBack = view.findViewById(R.id.ll_back);
        llBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(activity != null)
                    activity.finish();
            }
        });
        tvRigthText.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moreMenuPopupWindow == null) {
                    View popView = inflate(getContext(), R.layout.popup_index_more, null);
                    popView.findViewById(R.id.rl_pub_new).setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            getContext().startActivity(new Intent(getContext(), PublishNewProductActivity.class));
                            moreMenuPopupWindow.dismiss();
                        }
                    });
                    moreMenuPopupWindow = new PopupWindow(popView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                    final ColorDrawable dw = new ColorDrawable(Color.TRANSPARENT);
                    moreMenuPopupWindow.setBackgroundDrawable(dw);
                    moreMenuPopupWindow.setOutsideTouchable(true);
                }
                moreMenuPopupWindow.showAsDropDown(TitleBar.this, getWidth(), 0);
            }
        });
    }

    public void setTitle(CharSequence title){
        tvTitle.setText(title);
    }

    public void setRigthPlusVisibled(boolean visibled){
        tvRigthText.setVisibility(visibled ? VISIBLE : GONE);
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
        llBack.setVisibility(activity == null ? GONE : VISIBLE);
    }
}
