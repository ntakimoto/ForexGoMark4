package com.uppergain.mark4.framework.observer;

import java.math.BigDecimal;

public interface Observer {

    public void update(String timeStamp, BigDecimal ask, BigDecimal bit);

}
