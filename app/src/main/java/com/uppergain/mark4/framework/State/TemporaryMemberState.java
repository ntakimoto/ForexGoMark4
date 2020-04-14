package com.uppergain.mark4.framework.State;

import android.util.Log;

/**
 * 仮会員または退会会員クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author ntakimoto
 * @version 0.0.3
 * @since 2020-02-14
 */
public class TemporaryMemberState implements State {
    private static final String TAG = "TemporaryMemberState";

    UserState userState;

    public TemporaryMemberState() {
    }

    /**
     * @param userState
     */
    public TemporaryMemberState(UserState userState) {
        this.userState = userState;
        //共通機能に現在ステータスを設定
        Log.d(TAG, "*********************仮会員または退会会員*********************");
        userState.setState(this);
    }

    /**
     * 新規登録処理
     */
    @Override
    public void register() {

    }

    /**
     * 退会会員から無料会員へ復帰する処理
     */
    @Override
    public void change() {
        userState.setState(userState.getFreeMemberState());
    }

    /**
     * 対象外
     */
    @Override
    public void entry() {
        //対象外
    }

    /**
     * 対象外
     */
    @Override
    public void exit() {
        //対象外
    }

    /**
     * 対象外
     */
    @Override
    public void browseVideos() {
        //対象外
    }

    /**
     * 対象外
     */
    @Override
    public void sell() {
        //対象外
    }

    /**
     * 対象外
     */
    @Override
    public void buy() {
        //対象外
    }

    /**
     * 対象外
     */
    @Override
    public boolean confirm() {
        //対象外
        return false;
    }

    /**
     * 対象外
     */
    @Override
    public void viewAdd() {
        //対象外
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
