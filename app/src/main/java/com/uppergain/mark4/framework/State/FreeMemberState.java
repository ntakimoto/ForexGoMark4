package com.uppergain.mark4.framework.State;

import android.util.Log;

/**
 * 無料会員または休会会員クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-14
 */
public class FreeMemberState implements State {
    private static final String TAG = "FreeMemberState";

    UserState userState;

    /**
     * @param userState
     */
    public FreeMemberState(UserState userState) {
        this.userState = userState;
        Log.d(TAG, "*********************無料会員または休会会員*********************");
    }

    /**
     * 無料会員から有料会員へ申し込む処理
     */
    @Override
    public void register() {

    }

    /**
     * 有料会員へアップグレードする処理
     */
    @Override
    public void change() {
        userState.setState(userState.getPaidMemberState());
    }

    /**
     *
     */
    @Override
    public void entry() {

    }

    /**
     *
     */
    @Override
    public void exit() {

    }

    /**
     * チュートリアルをYoutubeで閲覧する処理
     */
    @Override
    public void browseVideos() {

    }

    @Override
    public void sell() {
        //対象外
    }

    /**
     * ステージレベル20以上で解放される処理
     */
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
