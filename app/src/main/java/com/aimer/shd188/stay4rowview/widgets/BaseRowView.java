package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.aimer.shd188.stay4rowview.OnRowClickListener;

/**
 * Created by shd on 2015/9/7.
 */
public abstract class BaseRowView extends LinearLayout {
    public BaseRowView(Context context) {
        super(context);
    }

    public BaseRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract void initData(BaseRowDescriptor descriptor, OnRowClickListener listener);

    public abstract void notifyDataChange();
}
