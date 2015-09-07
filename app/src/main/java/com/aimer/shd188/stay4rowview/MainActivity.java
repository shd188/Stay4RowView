package com.aimer.shd188.stay4rowview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.aimer.shd188.stay4rowview.widgets.ActionEnum;
import com.aimer.shd188.stay4rowview.widgets.GroupView;

import java.util.List;


public class MainActivity extends Activity implements OnRowClickListener {

    private List<GroupView> groupViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

////        NormalRowView normalRowView = (NormalRowView) findViewById(R.id.normalRowView);
////        normalRowView.initData(R.mipmap.ic_launcher, "new name", ActionEnum.MY_POSTS,this);
////        normalRowView.initData(R.mipmap.ic_launcher,"new name");
//
////        GroupView groupView = (GroupView) findViewById(R.id.groupView);
////        GroupView groupView=new GroupView(this);
//        List<RowDescriptor> descriptors = new ArrayList<>();
//        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher, "new 1", ActionEnum.NEW_1));
//        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher, "new 2", ActionEnum.NEW_2));
//        descriptors.add(new RowDescriptor(R.mipmap.ic_launcher, "new 3", ActionEnum.NEW_3));
////        groupView.initView(descriptors, this);
////        groupView.notifyDataChanged();
////
////        GroupView groupView1=new GroupView(this);
//        List<RowDescriptor> descriptors1 = new ArrayList<>();
//        descriptors1.add(new RowDescriptor(R.mipmap.ic_launcher, "new 1", ActionEnum.NEW_1));
////        groupView1.initView(descriptors1, this);
////        groupView1.notifyDataChanged();
//
//        GroupDescriptor groupDescriptor=new GroupDescriptor(descriptors);
//        GroupDescriptor groupDescriptor1=new GroupDescriptor(descriptors1);
//
//        List<GroupDescriptor> groupDescriptors=new ArrayList<>();
//        groupDescriptors.add(groupDescriptor1);
//        groupDescriptors.add(groupDescriptor);
//        ContainerView containerView= (ContainerView) findViewById(R.id.containerView);
//
////        groupViews=new ArrayList<>();
////        groupViews.add(groupView);
////        groupViews.add(groupView1);
////        containerView.initView(groupViews);
////        containerView.notifyDataChange();
//        containerView.initData(groupDescriptors,this);
//        containerView.notifyDataChange();
    }

    @Override
    public void onRowClick(ActionEnum action) {
        Toast.makeText(MainActivity.this, action.name() + "-click", Toast.LENGTH_SHORT).show();

    }
}
