package com.uppergain.mark4.framework.io;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

/**
 * 共通機能インターフェイス<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-22
 */
public interface DataIO {

    void set() throws FileNotFoundException;
    boolean existenceData();
    String reader(String key);
    ArrayList<String> getAllElement(String key);
    void writer(Map<String, String> saveData);
    void update(String key, String element);
    void elete(String key);
    void execute();

}
