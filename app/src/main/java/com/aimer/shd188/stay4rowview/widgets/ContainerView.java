package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.aimer.shd188.stay4rowview.OnRowClickListener;

import java.util.List;

/**
 * Created by shd on 2015/9/7.
 */
public class ContainerView extends LinearLayout {
    private Context context;
    private List<GroupDescriptor> groupDescriptors;
    private List<GroupView> groupViews;
    private OnRowClickListener listener;

    public ContainerView(Context context) {
        super(context);
        initView(context);
    }

    public ContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ContainerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        this.context=context;
        setOrientation(VERTICAL);

    }

    public void initData(List<GroupDescriptor> groupDescriptors,OnRowClickListener listener){
        this.groupDescriptors = groupDescriptors;
        this.listener=listener;
    }

    public void notifyDataChange() {
        float density = context.getResources().getDisplayMetrics().density;
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        params.topMargin = (int) (20 * density);
        for (GroupDescriptor groupDescriptor : groupDescriptors) {
            GroupView groupView=new GroupView(context);
            groupView.initView(groupDescriptor.rowDescriptors,listener);
            groupView.notifyDataChanged();
            addView(groupView, params);
        }
    }
}
