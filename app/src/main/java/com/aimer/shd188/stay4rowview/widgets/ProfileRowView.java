package com.aimer.shd188.stay4rowview.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import com.aimer.shd188.stay4rowview.OnRowClickListener;
import com.aimer.shd188.stay4rowview.R;

import java.util.List;

/**
 * Created by shd on 2015/9/7.
 */
public class ProfileRowView extends BaseRowView {
    private Context context;
    private ImageView mWidgetRowIconImg;
    private TextView mWidgetRowLabel;
    private TextView mWidgetRowDetailLabel;
    private ImageView mWidgetRowActionImg;

    public ProfileRowView(Context context) {
        super(context);
    }

    public ProfileRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProfileRowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initView(Context context) {
        this.context = context;
        LayoutInflater.from(context).inflate(R.layout.widget_profile_row, this);
        mWidgetRowIconImg = (ImageView) findViewById(R.id.mWidgetRowIconImg);
        mWidgetRowLabel = (TextView) findViewById(R.id.mWidgetRowLabel);
        mWidgetRowDetailLabel = (TextView) findViewById(R.id.mWidgetRowDetailLabel);
        mWidgetRowActionImg = (ImageView) findViewById(R.id.mWidgetRowActionImg);
        mWidgetRowActionImg.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public void initData(List<BaseRowDescriptor> descriptors, OnRowClickListener listener) {


    }

    @Override
    public void notifyDataChange() {

    }
}
