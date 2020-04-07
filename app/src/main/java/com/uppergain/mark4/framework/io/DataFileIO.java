package com.uppergain.mark4.framework.io;

public interface DataFileIO {

    Object reder(String target);

    void writer(String target,Object data);

    Object update(String key, Object newData);

    void delete(String targetData);

    int counter();

}
