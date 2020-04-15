package com.uppergain.mark4.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.uppergain.mark4.R;


public class SettingFragment extends Fragment {

    //フラグメントを生成するときに呼び出されるメソッド
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //アクティビティと結びついたときに呼び出されるメソッド
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    //ActivityのonStartメソッド実行後に呼び出され、ユーザに対し画面表示を処理するメソッド
    @Override
    public void onStart() {
        super.onStart();
    }

    //ActivityのonResumeメソッド実行後に呼び出され、処理完了後にユーザからのイベントを待ち受ける
    @Override
    public void onResume() {
        super.onResume();
    }

    //ActivityのonPauseメソッド実行の直前に呼び出される
    @Override
    public void onPause() {
        super.onPause();
    }

    //ActivityのonStopメソッド実行の直前に呼び出される
    @Override
    public void onStop() {
        super.onStop();
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_setting, container, false);

        return root;
    }

    //フラグメントで表示するViewを生成するときに呼び出されるメソッド
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }
}
