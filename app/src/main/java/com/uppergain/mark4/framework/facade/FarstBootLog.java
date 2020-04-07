package com.uppergain.mark4.framework.facade;

import android.content.Context;

public class FarstBootLog {

    private Context context;

    public void run(Context context){
        GemeStartFacade facade = new GemeStartFacade(
                new AppPermission(context),
                new AppCommunication(context),
                new AppVerUp(),
                new AppUserInfo(context),
                new AppInfo()
        );

        facade.startGeme();
    }
}
