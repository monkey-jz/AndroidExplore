package com.jerryzhu.androidexplore.ui.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jerryzhu.androidexplore.R;
import com.jerryzhu.androidexplore.app.Constants;

public class CollectFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        inflater.inflate(R.layout.fragment_test,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public static CollectFragment getInstance(String params1, String params2) {

        CollectFragment fragment = new CollectFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.ARG_PARAM1,params1);
        bundle.putString(Constants.ARG_PARAM2,params2);
        fragment.setArguments(bundle);

        return fragment;

    }
}
