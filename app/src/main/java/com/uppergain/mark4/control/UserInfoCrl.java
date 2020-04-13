package com.uppergain.mark4.control;

import com.uppergain.mark4.entity.UserInfo;
import com.uppergain.mark4.framework.io.FireBaseData;
import com.uppergain.mark4.framework.io.YamlFileData;

import java.io.File;

/**
* ユーザ情報を操作するクラス<br>
* 基底GoF:Strategy + State
*
* @author ntakimoto
* @version 0.0.1
* @since 2020-04-04
*/
public class UserInfoCrl{

	private YamlFileData yData;
	private FireBaseData fData;

	public UserInfoCrl() {
		this.yData = new YamlFileData();
	}
	
	public UserInfoCrl(String filePath) {
		this.yData = new YamlFileData();
		yData.setFilePath(filePath);
	}
	

	/**
	 * ユーザ情報ファイルを作成する
	 * 
	 * @param fileName ファイル名
	 * @param userInfo ユーザ情報
	 */
	public void add(String fileName, Object userInfo) {
		yData.writer(fileName, userInfo);
	}

	/**
	 * 指定するファイルが存在有無を確認し、存在しない場合は作成する
	 * 
	 * @param fileName
	 * @param userInfo
	 * @return 正常処理もしくは異常処理
	 */
	public boolean isCheckedFile(String fileName, Object userInfo) {
		String path = yData.getFilePath();
		File file = new File(path + fileName + ".yaml");
		// フォルダの存在を確認する
		if (!file.exists()) {
			this.add(fileName, userInfo);
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 指定するファイルが存在有無を確認し、存在する場合は新しいデータに置き換える
	 * 
	 * @param fileName
	 * @param newData
	 * @return 正常処理もしくは異常処理
	 */
	public boolean isFileUpdata(String fileName, UserInfo newData) {
		return (boolean) yData.update(fileName, newData);
	}

	/**
	 * ファイルに保存してるUGCon数を返す
	 * 
	 * @return 所有コイン数
	 */
	public String getCoin() {
		UserInfo userInfo = getUserInfo("user_info");
		return userInfo.getCoin();
	}

	/**
	 * 対象となるファイルをオブジェクトを返す
	 * 
	 * @param fileName
	 * @return 対象となるオブジェクト
	 */
	public UserInfo getUserInfo(String fileName) {
		return (UserInfo) yData.reder(fileName);
	}
}
