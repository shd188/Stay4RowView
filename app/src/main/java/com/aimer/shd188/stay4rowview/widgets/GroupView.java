package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.aimer.shd188.stay4rowview.OnRowClickListener;
import com.aimer.shd188.stay4rowview.R;

import java.util.List;

/**
 * Created by shd188 on 15/9/5.
 */
public class GroupView extends LinearLayout {

    private final Context context;
    private List<BaseRowDescriptor> descriptors;
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

    public void initView(List<BaseRowDescriptor> descriptors, OnRowClickListener listener) {
        setOrientation(VERTICAL);
        this.descriptors = descriptors;
        this.listener = listener;
    }

    public void notifyDataChanged() {
        if (descriptors != null && descriptors.size() > 0) {
            LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
            BaseRowDescriptor baseRowDescriptor=null;
            BaseRowView baseRowView=null;
            for (int i = 0; i < descriptors.size(); i++) {
                baseRowDescriptor=descriptors.get(i);
                if (baseRowDescriptor instanceof RowDescriptor) {
                    baseRowView = new NormalRowView(context);

                }else if (baseRowDescriptor instanceof ProfileRowDescriptor){
                    baseRowView=new ProfileRowView(context);
                }
                baseRowView.initData(baseRowDescriptor, listener);
                baseRowView.notifyDataChange();
                addView(baseRowView);
                if (i != descriptors.size() - 1) {
                    View view = new View(context);
                    view.setBackgroundColor(getResources().getColor(R.color.line));
                    addView(view, params);
                }
            }
            setBackgroundColor(Color.WHITE);
        } else {
            setVisibility(GONE);
        }
    }

}
