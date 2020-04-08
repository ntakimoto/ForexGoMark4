package com.uppergain.mark4.Exception;

/**
 * 例外処理クラス［書き込み処理］<br>
 * 基底GoF:なし
 *
 * @author Natsumi Takimoto
 * @version 0.0.1
 * @since 2020-02-22
 */
public class ForexGoIOWriterException extends Exception {

    private static final long serialVersionUID = 1L;

    public ForexGoIOWriterException(String msg){
        super(msg);
    }
}
