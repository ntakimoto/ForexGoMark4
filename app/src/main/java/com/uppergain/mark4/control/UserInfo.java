package com.uppergain.mark4.control;

import com.uppergain.mark4.framework.io.DataIO;
import com.uppergain.mark4.framework.io.FileIO;
import com.uppergain.mark4.framework.io.PrefFile;

public class UserInfo extends DataCrl {

    PrefFile prefFile;

    public UserInfo(){
        dataIO = new PrefFile();
        fileIO = new PrefFile();
        prefFile = new PrefFile();
    }

    public void writeUserInfo(){

    }

    @Override
    public void setFileIO(FileIO fileIO) {
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
