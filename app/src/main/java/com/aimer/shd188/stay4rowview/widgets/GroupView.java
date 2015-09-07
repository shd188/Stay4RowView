package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
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
            LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
            for (int i = 0; i < descriptors.size(); i++) {
                rowView = new NormalRowView(context);
                rowView.initializeData(descriptors.get(i), listener);
                rowView.notifyDataChange();
                addView(rowView);
                if (i != descriptors.size() - 1) {
                    View view = new View(context);
                    view.setBackgroundColor(getResources().getColor(R.color.line));
                    addView(view, params);
                }
            }
        } else {
            setVisibility(GONE);
        }
    }

}
