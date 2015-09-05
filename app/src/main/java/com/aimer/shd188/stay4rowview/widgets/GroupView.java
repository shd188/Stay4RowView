package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.aimer.shd188.stay4rowview.OnRowClickListener;

import java.util.List;

/**
 * Created by shd188 on 15/9/5.
 */
public class GroupView extends LinearLayout implements View.OnClickListener {

    private final Context context;
    private List<RowDescriptor> descriptors;
    private OnRowClickListener listener;

    public GroupView(Context context) {
        super(context);
        this.context = context;
    }

    public GroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public GroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    public void initView(List<RowDescriptor> descriptors, OnRowClickListener listener) {
        setOrientation(VERTICAL);
        this.descriptors = descriptors;
        this.listener = listener;
    }

    public void notifyDataChanged() {
        NormalRowView rowView = null;
        if (descriptors != null && descriptors.size() > 0) {
            for (RowDescriptor descriptor : descriptors) {
                rowView = new NormalRowView(context);
                rowView.initializeData(descriptor);
                rowView.notifyDataChange();
                addView(rowView);
            }
        } else {
            setVisibility(GONE);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
