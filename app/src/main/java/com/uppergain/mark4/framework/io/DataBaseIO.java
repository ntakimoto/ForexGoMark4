package com.uppergain.mark4.framework.io;

import java.util.ArrayList;
import java.util.Map;

/**
 * 共通機能［内部／外部DataBase］クラス<br>
 * 基底GoF:Strategyパターン
 *
 * @author ntakimoto
 * @version 0.0.1
 * @since 2020-02-22
 */
public class DataBaseIO implements DataIO {

    boolean isInsideDataBase;

    public DataBaseIO(Boolean isInsideDataBase){
        this.isInsideDataBase = isInsideDataBase;
        set();
    }

    @Override
    public void set() {
        if(isInsideDataBase){
            //内部DB
        }else {
            //外部
        }
    }

    @Override
    public boolean existenceData() {
        return false;
    }

    @Override
    public String reader(String key) {
        return null;
    }

    @Override
    public ArrayList<String> getAllElement(String key) {
        return null;
    }

    @Override
    public void writer(Map<String, String> saveData) {

    }

    @Override
    public void update(String key, String element) {

    }

    @Override
    public void elete(String key) {

    }

    @Override
    public void execute() {

    }
}
