package com.uppergain.mark4.framework.State;

import android.util.Log;

/**
 * 有料会員クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-14
 */
public class PaidMemberState implements State {
    private static final String TAG = "PaidMemberState";

    UserState userState;

    /**
     * @param userState
     */
    public PaidMemberState(UserState userState) {
        this.userState = userState;
        Log.d(TAG, "*********************有料会員*********************");
    }

    @Override
    public String readPreference() {
        return null;
    }

    @Override
    public void writePreference(UserState userState)  {

    }

    @Override
    public void register() {

    }

    @Override
    public void change() {

    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void browseVideos() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void buy() {

    }

    /**
     * ゲームオーバーであるか判定する処理
     * @return GemeOver
     */
    @Override
    public boolean confirm() {
        return false;
    }

    /**
     * ノーポジションである場合、広告を表示する処理
     */
    @Override
    public void viewAdd() {

    }

    /**
     * アプリをバックグラウンドへ遷移した時の処理
     */
    @Override
    public void closed() {

    }

    /**
     * アプリキルした時の動作
     */
    @Override
    public void kill() {

    }
}
