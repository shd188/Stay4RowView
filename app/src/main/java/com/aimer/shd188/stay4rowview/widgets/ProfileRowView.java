package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aimer.shd188.stay4rowview.OnRowClickListener;
import com.aimer.shd188.stay4rowview.R;

/**
 * Created by shd on 2015/9/7.
 */
public class ProfileRowView extends BaseRowView implements View.OnClickListener {
    private Context context;
    private ImageView mWidgetRowIconImg;
    private TextView mWidgetRowLabel;
    private TextView mWidgetRowDetailLabel;
    private ImageView mWidgetRowActionImg;
    private ProfileRowDescriptor descriptor;
    private OnRowClickListener listener;

    public ProfileRowView(Context context) {
        super(context);
        this.context=context;
        initView();
    }

    public ProfileRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        initView();
    }

    public ProfileRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(context).inflate(R.layout.widget_profile_row, this);
        mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
        mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
        mWidgetRowDetailLabel = (TextView) findViewById(R.id.mWidgetRowDetailLabel);
        mWidgetRowActionImg = (ImageView) findViewById(R.id.mWidgetRowActionImg);
        mWidgetRowActionImg.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public void initData(BaseRowDescriptor descriptor, OnRowClickListener listener) {
        this.descriptor = (ProfileRowDescriptor) descriptor;
        this.listener = listener;

    }

    @Override
    public void notifyDataChange() {
        if (descriptor != null) {
            mWidgetRowActionImg.setBackgroundResource(R.mipmap.ic_launcher);
            mWidgetRowLabel.setText(descriptor.label);
            mWidgetRowDetailLabel.setText(descriptor.detailLabel);
            if (descriptor.action != null) {
                mWidgetRowActionImg.setVisibility(VISIBLE);
                setOnClickListener(this);
                setBackgroundResource(R.drawable.widgets_general_row_selector);
            } else {
                mWidgetRowActionImg.setVisibility(GONE);
                setBackgroundColor(Color.WHITE);
            }
            setVisibility(VISIBLE);
        } else {
            setVisibility(GONE);
        }
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.onRowClick(descriptor.action);
        }
    }
}
