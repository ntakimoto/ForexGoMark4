package com.uppergain.mark4;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.uppergain.mark4.entity.UserInfo;
import com.uppergain.mark4.control.UserInfoCrl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class UserInfoCrlTest1 {

	UserInfoCrl sut;
	UserInfo userInfo;

	@Before
	public void setUp() throws Exception {
		userInfo = new UserInfo();
		userInfo.setCoin("20000");		
		sut = new UserInfoCrl();
	}

	@Test
	public void 指定するファイルが存在有無を確認する() {
		boolean actual = true;// 事前準備
		boolean expected = sut.isCheckedFile("user_info", userInfo);// 実行
		assertThat(actual, is(expected));// 検証
	}

	@Test
	public void ユーザ情報ファイルから所有金額を取得する() {
		String actual = "60000";// 事前準備
		String expected = sut.getCoin();// 実行
		assertThat(actual, is(expected));// 検証
	}

	@Test
	public void 指定するファイルが存在有無を確認し存在する場合は新しいデータに置き換える() {
		UserInfo newData = new UserInfo();// 事前準備
		newData.setCoin("60000");
		boolean actual = true;
		boolean expected = sut.isFileUpdata("user_info", newData);// 実行
		assertThat(actual, is(expected));// 検証
	}
}
