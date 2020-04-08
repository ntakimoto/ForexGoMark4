package com.uppergain.mark4.framework.State;

import com.uppergain.mark4.framework.Exception.ForexGoIOWriterException;

/**
 * <br>
 * 基底GoF:Stateパターン + Adapterパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-20
 */
public class TemporayAdapter implements State {

    Pref pref;

    public TemporayAdapter(Pref pref){
        this.pref = pref;
    }

    @Override
    public String readPreference() {
        return pref.readPreference();
    }

    @Override
    public void writePreference(UserState userState) throws ForexGoIOWriterException {

    }

    @Override
    public void register() {

    }

    @Override
    public void change() {

    }

    @Override
    public void entry() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void browseVideos() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void buy() {

    }

    @Override
    public boolean confirm() {
        return false;
    }

    @Override
    public void viewAdd() {

    }

    @Override
    public void closed() {

    }

    @Override
    public void kill() {

    }
}
