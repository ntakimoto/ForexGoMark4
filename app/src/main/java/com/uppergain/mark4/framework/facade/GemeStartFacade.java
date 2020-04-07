package com.uppergain.mark4.framework.facade;

import android.util.Log;

/**
 * 一連の動作を処理するクラス<br>
 * 基底GoF:Facadeパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-24
 */
public class GemeStartFacade {
    private static final String TAG = "FarstBootFacade";

    private AppPermission permission;
    private AppCommunication communication;
    private AppVerUp verUp;
    private AppUserInfo userInfo;
    private AppInfo info;
    private AppSystemMaintenance systemMaintenance;

    public GemeStartFacade(){
        this.verUp = new AppVerUp();
        this.info = new AppInfo();
        this.systemMaintenance = new AppSystemMaintenance();
    }

    public GemeStartFacade(AppPermission permission,
                           AppCommunication communication,
                           AppVerUp verUp,
                           AppUserInfo userInfo,
                           AppInfo info) {
        this.permission = permission;
        this.communication = communication;
        this.verUp = verUp;
        this.userInfo = userInfo;
        this.info = info;
    }

    public void startGeme() {
        Log.d(TAG, "startUpApp: 一連の処理を行います");
        verUp.sysCheck();
        info.sysCheck();
        //systemMaintenance.sysCheck();
    }

}
