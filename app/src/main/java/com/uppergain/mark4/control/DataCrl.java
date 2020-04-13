package com.uppergain.mark4.control;

import com.uppergain.mark4.framework.io.DataFileIO;
import com.uppergain.mark4.framework.io.DataIO;

/**
 * データを操作する基底クラス<br>
 * 基底GoF:Strategy
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-04-12
 */
public abstract class DataCrl {

    DataFileIO fileIO;
    DataIO dataIO;

    public void insertData() {
        //dataIO.writer();
    }

    public Object getData(String target) {
        return dataIO.reader(target);
    }

    public void insertFileIO(String target) {
        fileIO.reder(target);
    }

    public Object getFileData() {
        return null;
    }

    public void setFileIO(DataFileIO fileIO) {
        this.fileIO = fileIO;
    }

    public void setDataIO(DataIO dataIO) {
        this.dataIO = dataIO;
    }
}
