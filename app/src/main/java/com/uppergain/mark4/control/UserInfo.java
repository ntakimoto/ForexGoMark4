package com.uppergain.mark4.control;

import com.uppergain.mark4.ForexGoApp;
import com.uppergain.mark4.framework.io.DataIO;
import com.uppergain.mark4.framework.io.FileIO;
import com.uppergain.mark4.framework.io.PrefFile;

import java.util.HashMap;
import java.util.Map;

public class UserInfo extends DataCrl {

    PrefFile prefFile;

    public UserInfo(){
        dataIO = new PrefFile();
        fileIO = new PrefFile();
        prefFile = new PrefFile();
    }

    public void writeUserInfo(){
        Map<String, String> saveData = new HashMap<>();
        saveData.put("USER_STATUS", "" + "0");
        saveData.put("REGISTER_DATE", "" + ForexGoApp.getInstance().getDate());
        saveData.put("USER_SEQ", "" + ForexGoApp.getInstance().getCreatedUUID());
        fileIO.makeFile("USER_INFO",saveData);
    }

    @Override
    public void setObjectIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    @Override
    public void setDataIO(DataIO dataIO) {
        this.dataIO = dataIO;
    }

    @Override
    public void updataData(String value) {
        dataIO.updateData("USER_STATUS",value);
    }

    @Override
    public String getUserStatus() {
        String status = prefFile.getUserStatus("USER_INFO");
        return status;
    }
}
