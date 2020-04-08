package com.uppergain.mark4.framework.State;

import android.util.Log;

import com.uppergain.mark4.Exception.ForexGoIOWriterException;

/**
 * 未納状態の会員クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-14
 */
public class UnpaidMemberState implements State {
    private static final String TAG = "UnpaidMemberState";

    UserState userState;

    /**
     * @param userState
     */
    public UnpaidMemberState(UserState userState) {
        this.userState = userState;
        Log.d(TAG, "*********************未納会員*********************");
    }

    @Override
    public String readPreference() {
        return null;
    }

    @Override
    public void writePreference(UserState userState) throws ForexGoIOWriterException {

    }

    /**
     * 滞納が解消した場合の処理
     */
    @Override
    public void register() {
        //TODO:Googleストア管理上から入金ステータスを取得する
        change();
    }

    /**
     * 有料会員に復帰する処理
     */
    @Override
    public void change() {
        userState.setState(userState.getPaidMemberState());
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
