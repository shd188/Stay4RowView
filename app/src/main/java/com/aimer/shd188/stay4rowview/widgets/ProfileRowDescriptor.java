package com.aimer.shd188.stay4rowview.widgets;

/**
 * Created by shd on 2015/9/7.
 */
public class ProfileRowDescriptor extends BaseRowDescriptor {
    public String imgUrl;
    public String label;
    public String detailLabel;

    public ProfileRowDescriptor(String imgUrl, String label, String detailLabel) {
        this.imgUrl = imgUrl;
        this.label = label;
        this.detailLabel = detailLabel;
    }
}
