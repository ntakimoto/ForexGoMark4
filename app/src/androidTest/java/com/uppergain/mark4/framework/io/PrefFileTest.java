package com.uppergain.mark4.framework.io;

import com.uppergain.mark4.ForexGoApp;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PrefFileTest {

    PrefFile sut;

    @Before
    public void setUp() throws Exception {
        sut = new PrefFile();
        Map<String, String> saveData = new HashMap<>();
        saveData.put("USER_STATUS", "" + "0");
        saveData.put("REGISTER_DATE", "" + ForexGoApp.getInstance().getDate());
        saveData.put("USER_SEQ", "" + ForexGoApp.getInstance().getCreatedUUID());
        sut.makeFile("USER_INFO",saveData);
    }

    @Test
    public void readData() {

    }

    @Test
    public void 会員種別を取得する() {
        String actual = "0";// 事前準備
        sut.updateData("USER_STATUS","0");
        String expected = sut.getUserStatus("USER_INFO");// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void ユーザSEQを取得する() {
        String actual = "90b369d71b";// 事前準備
        String expected = sut.getUserSeq("USER_INFO");// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void 初回起動日を取得する() {
        String actual = "2020/04/13";// 事前準備
        String expected = sut.getRegisterDate("USER_INFO");// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void 対象となるファイルが存在有無判定() {
        boolean actual = true;// 事前準備
        boolean expected = sut.isTargetFile("USER_INFO");// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void 登録済みの場合の会員種別を取得する() {
        String actual = "1";// 事前準備
        sut.updateData("USER_STATUS","1");
        String expected = sut.getUserStatus("USER_INFO");// 実行
        assertThat(actual, is(expected));// 検証
    }
}