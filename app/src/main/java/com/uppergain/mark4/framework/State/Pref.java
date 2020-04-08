package com.uppergain.mark4.framework.State;

/**
 * <br>
 * 基底GoF:Adapterパターン
 *
 * @author Natsumi Takimoto
 * @version 0.0.1
 * @since 2020-02-20
 */
public interface Pref {

    String readPreference();
    void writePreference(String userStatus);

}
