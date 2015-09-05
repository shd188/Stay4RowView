package com.aimer.shd188.stay4rowview.widgets;

import com.aimer.shd188.stay4rowview.ActionEnum;

/**
 * Created by shd188 on 15/9/5.
 */
public class RowDescriptor {
    public int imgRes;
    public String label;
    public ActionEnum action;

    public RowDescriptor(int imgRes, String label, ActionEnum action) {
        this.imgRes = imgRes;
        this.label = label;
        this.action = action;
    }
}
