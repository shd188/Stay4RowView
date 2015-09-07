package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aimer.shd188.stay4rowview.OnRowClickListener;
import com.aimer.shd188.stay4rowview.R;

/**
 * Created by shd188 on 15/9/1.
 */
public class NormalRowView extends BaseRowView implements View.OnClickListener {

    private final Context context;
    private ImageView mWidgetRowIconImg;
    private TextView mWidgetRowLabel;
    private ImageView mWidgetRowActionImg;
    private OnRowClickListener listener;
    private RowDescriptor descriptor;

    public NormalRowView(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public NormalRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initView();
    }

    public NormalRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        initView();
    }

    @Override
    public void initData(BaseRowDescriptor descriptor, OnRowClickListener listener) {
        this.descriptor = (RowDescriptor)descriptor;
        this.listener = listener;
    }

    private void initView() {
        LayoutInflater.from(context).inflate(R.layout.widget_general_row, this);
        mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
        mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
        mWidgetRowActionImg = (ImageView) findViewById(R.id.mWidgetRowActionImg);
        mWidgetRowActionImg.setBackgroundResource(R.mipmap.ic_launcher);
    }

//    public void initData(int iconImgRes, String label, ActionEnum action, OnRowClickListener listener) {
//        this.action = action;
//        this.listener = listener;
//        mWidgetRowIconImg.setBackgroundResource(iconImgRes);
//        mWidgetRowLabel.setText(label);
//        if (action != null) {
//            setOnClickListener(this);
//            mWidgetRowActionImg.setVisibility(VISIBLE);
//            setBackgroundResource(R.drawable.widgets_general_row_selector);
//        } else {
//            mWidgetRowActionImg.setVisibility(GONE);
//        }
//    }
//
//    public void initData(int iconImgRes, String label) {
//        mWidgetRowIconImg.setBackgroundResource(iconImgRes);
//        mWidgetRowLabel.setText(label);
//        mWidgetRowActionImg.setVisibility(GONE);
//    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onRowClick(descriptor.action);
        }
    }

    @Override
    public void notifyDataChange() {
        if (descriptor != null) {
            mWidgetRowIconImg.setBackgroundResource(descriptor.imgRes);
            mWidgetRowLabel.setText(descriptor.label);
            if (descriptor.action != null) {
                setOnClickListener(this);
                mWidgetRowActionImg.setVisibility(VISIBLE);
                setBackgroundResource(R.drawable.widgets_general_row_selector);
            } else {
                mWidgetRowActionImg.setVisibility(GONE);
            }
        } else {
            setVisibility(GONE);
        }
    }
}
