package com.uppergain.mark4.control;

import com.uppergain.mark4.framework.io.DataIO2;
import com.uppergain.mark4.framework.io.FileIO;
import com.uppergain.mark4.framework.io.PrefFile;

public class UserInfo extends DataCrl {

    public UserInfo(){
        dataIO = new PrefFile();
        fileIO = new PrefFile();
    }

    public void writeUserInfo(){

    }

    @Override
    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    @Override
    public void setDataIO(DataIO2 dataIO) {
        this.dataIO = dataIO;
    }
}
