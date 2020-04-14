package com.uppergain.mark4.framework.io;

public interface DataIO {
    Object readData(String target);
    Object updateData(String key, Object newData);
    void deleteData(String targetData);
    int counter();
}
