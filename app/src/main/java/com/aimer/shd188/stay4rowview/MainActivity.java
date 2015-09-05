package com.aimer.shd188.stay4rowview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.aimer.shd188.stay4rowview.widgets.GroupView;
import com.aimer.shd188.stay4rowview.widgets.RowDescriptor;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity implements OnRowClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        NormalRowView normalRowView = (NormalRowView) findViewById(R.id.normalRowView);
//        normalRowView.initData(R.mipmap.ic_launcher, "new name", ActionEnum.MY_POSTS,this);
//        normalRowView.initData(R.mipmap.ic_launcher,"new name");

        GroupView groupView= (GroupView) findViewById(R.id.groupView);
        List<RowDescriptor> descriptors=new ArrayList<>();
        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher,"new 1",ActionEnum.MY_POSTS));
        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher,"new 2",ActionEnum.MY_POSTS));
        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher,"new 3",ActionEnum.MY_POSTS));
        groupView.initView(descriptors,this);
        groupView.notifyDataChanged();
    }

    @Override
    public void onRowClick(ActionEnum action) {
        if (ActionEnum.MY_POSTS==action){
            Toast.makeText(MainActivity.this, "MY_POSTS-click", Toast.LENGTH_LONG).show();
        }
    }
}
