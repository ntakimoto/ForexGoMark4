package com.uppergain.mark4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.uppergain.mark4.R;

public class ChartFragment extends Fragment {

    //初期処理
    //ユーザ操作
    //バックグランド時
    //アプリキル時

    //https://qiita.com/j_catfish/items/fc5167d09eba15bdd8ff

    private static final String TAG = "ChartFragmet";

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_chartview,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }

}