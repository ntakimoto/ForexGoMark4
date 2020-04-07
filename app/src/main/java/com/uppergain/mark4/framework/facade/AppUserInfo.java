package com.uppergain.mark4.framework.facade;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.io.File;

//現在のユーザ情報
public class AppUserInfo implements CheckAction {
    private static final String TAG = "AppUserInfo";

    private SharedPreferences.Editor editor;
    private SharedPreferences prefer;
    private Context context;
    final String path = "";

    public AppUserInfo(Context context) {
        this.context = context;
        prefer = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public void sysCheck() {
        Log.d(TAG, "sysCheck: 会員情報を確認します");
        if (userFile()) {
            //初回起動以外
            readUserInfo();
        } else {
            //初回起動
            createUserFile();
        }
    }

    //プレファレンスファイルの有無
    private boolean userFile() {
        File file = new File(path + getDefaultSharedPreferencesName(context) +".xml");
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    //プレファレンス作成
    private void createUserFile() {
        //ファイル名
        getDefaultSharedPreferencesName(context);
        //初回起動
        prefer.edit()
                .putString("UserInfo", "0")//仮登録
                .putString("", "")//USERSQL
                .putString("", "")//UID
                .putString("", "")//DATE
                .putString("", "")//LEVLE
                .putString("", "")//MONSTER_HP
                .putString("", "")//USER_HP
                .apply();
    }

    public void writeUserInfo() {
        //シングルトンへ登録
        prefer.edit().putString("string", "string").apply();
        /**
         * 1:無料会員
         *   会員登録が完了したユーザ
         * 2:有料会員
         * 　定期購読登録が完了したユーザ
         * 3:料金未滞納
         * 　定期購読登録が完了したユーザ
         * 4:料金滞納
         * 　定期購読登録が完了したユーザ
         * 5:休会員
         * 　定期購読登録が完了したユーザ
         * 6:退会済会員
         * 　定期購読登録が完了したユーザ
         */
    }

    public String readUserInfo() {
        //プレファレンスから取得
        prefer.getString("", "");
        return null;
    }

    public static SharedPreferences getDefaultSharedPreferences(Context context) {
        return context.getSharedPreferences(getDefaultSharedPreferencesName(context),
                getDefaultSharedPreferencesMode());
    }

    private static String getDefaultSharedPreferencesName(Context context) {
        return context.getPackageName() + "_preferences";
    }

    private static int getDefaultSharedPreferencesMode() {
        return Context.MODE_PRIVATE;
    }

    @Override
    public void showDialog() {
    }

    @Override
    public boolean infoFlag() {
        return false;
    }

}
