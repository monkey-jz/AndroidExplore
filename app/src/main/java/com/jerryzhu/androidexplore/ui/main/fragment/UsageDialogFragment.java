package com.jerryzhu.androidexplore.ui.main.fragment;

import com.jerryzhu.androidexplore.R;
import com.jerryzhu.androidexplore.base.fragment.BaseDialogFragment;
import com.jerryzhu.androidexplore.bridge.main.UsageDialogBridge;

public class UsageDialogFragment extends BaseDialogFragment<UsageDialogBridge.Presenter> implements UsageDialogBridge.View {


    @Override
    protected void initEventAndData() {


    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_usage_dialog;
    }

    @Override
    public void showUsefulSites() {

    }
}
