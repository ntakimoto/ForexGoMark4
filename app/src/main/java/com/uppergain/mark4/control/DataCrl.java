package com.uppergain.mark4.control;


import com.uppergain.mark4.framework.io.DataIO;
import com.uppergain.mark4.framework.io.FileIO;

/**
 * データを操作する基底クラス<br>
 * 基底GoF:Strategy
 *
 * @author ntakimoto
 * @version 0.0.2
 * @since 2020-04-13
 */
public abstract class DataCrl {

    DataIO dataIO;
    FileIO fileIO;

    public abstract void setObjectIO(FileIO fileIO);
    public abstract void setDataIO(DataIO dataIO);
    public abstract String getUserStatus();
    public abstract void updataData(String s);
}
