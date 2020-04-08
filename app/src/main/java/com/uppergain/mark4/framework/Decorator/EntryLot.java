package com.uppergain.mark4.framework.Decorator;

import com.uppergain.gof.Singleton.Singleton;

public class EntryLot extends Calculation {

    @Override
    public String result() {
        return Singleton.getInstance().getLot();
    }
}
