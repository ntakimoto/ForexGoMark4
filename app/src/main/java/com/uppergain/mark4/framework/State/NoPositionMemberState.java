package com.uppergain.mark4.framework.State;

import android.util.Log;

/**
 * 保有ボジションが存在していない場合のクラス<br>
 * 基底GoF:Stateパターン
 *
 * @author Natsumi Takimoto
 * @version 0.0.1
 * @since 2020-02-14
 */
public class NoPositionMemberState implements State {
    private static final String TAG = "NoPositionMemberState";

    UserState userState;

    /**
     * @param userState
     */
    public NoPositionMemberState(UserState userState) {
        this.userState = userState;
        Log.d(TAG, "*********************ノーポジ状態*********************");
    }

    @Override
    public String readPreference() {
        return null;
    }

    @Override
    public void writePreference(UserState userState) {

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
