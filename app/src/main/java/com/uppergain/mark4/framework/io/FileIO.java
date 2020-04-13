package com.uppergain.mark4.framework.io;

public interface FileIO {

    void makeFile(String target,Object data);
    Object readFile(String target);
    Object updateFile(String key, Object newData);
    void deleteFile(String targetData);

}
