package com.uppergain.mark4.control;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UserInfoTest {

    UserInfo sut;

    @Before
    public void setUp() throws Exception {
        sut = new UserInfo();
    }

    @Test
    public void 初回起動以降の場合USER_STATUSが0である() {
        String actual = "0";// 事前準備
        String expected = sut.getUserStatus();// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void writeUserInfo() {
        int actual = 2;// 事前準備
        int expected = 2;// 実行
        assertThat(actual, is(expected));// 検証
    }

    @Test
    public void setFileIO() {
    }

    @Test
    public void setDataIO() {
    }
}