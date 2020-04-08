package com.uppergain.mark4.framework.State;

import android.util.Log;

import com.uppergain.mark4.Exception.ForexGoIOWriterException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 仮会員または退会会員クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author Natsumi Takimoto
 * @version 0.0.3
 * @since 2020-02-14
 */
public class TemporaryMemberState implements State {
    private static final String TAG = "TemporaryMemberState";

    UserState userState;
    //DataIO io;

    public TemporaryMemberState() {
    }

    /**
     * @param userState
     */
    public TemporaryMemberState(UserState userState) {
        this.userState = userState;
        //共通機能に現在ステータスを設定
        //Common.getInstance().setState(this.userState);
        //io = new PrefDataIO();
        Log.d(TAG, "*********************仮会員または退会会員*********************");
        createPreference();
        userState.setState(this);
    }

    /**
     * 【 2_0_2 】プレファレンスを作成する<br>
     * 0:仮会員または退会会員
     */
    public void createPreference() {
        //try {
        //    writePreference(userState);
        //} catch (ForexGoIOWriterException e) {
        //    e.printStackTrace();
        //}
    }

    /**
     * 【 2_0_3 】保存されているプレファレンス会員の状態を返す
     *
     * @return ユーザ会員の状態
     */
    @Override
    public String readPreference() {
        //return io.reader("USER_STATUS");
        return null;
    }

    /**
     * 【 2_0_3 】プレファレンスに書き込む前処理<br>
     * 登録日時<br>
     * ユーザシーケンス
     */
    @Override
    public void writePreference(UserState userState) throws ForexGoIOWriterException {
        if (userState.equals(userState)) {
            Map<String, String> saveData = new HashMap<>();
            saveData.put("USER_STATUS", "" + "0");
            //saveData.put("REGISTER_DATE", "" + Common.getInstance().getDate());
            saveData.put("USER_SEQ", "" + getCreatedUUID());
            //io.writer(saveData);
        } else throw new ForexGoIOWriterException("会員ステータスが不正です。");
    }

    /**
     * ユーザシーケンス発行し、その値を返す
     */
    private String getCreatedUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        return str.substring(24, 34);
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
