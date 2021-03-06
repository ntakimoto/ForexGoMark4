package com.uppergain.mark4.framework.State;

/**
 * 各会員の状態に対するインターフェイス<br>
 * 基底GoF:Stateパターン
 * @author ntakimoto
 * @since 2020-02-14
 * @version 0.0.1
 */
public interface State {

    void register();
    void change();
    void entry();
    void exit();
    void browseVideos();
    void sell();
    void buy();
    boolean confirm();
    void viewAdd();
    void closed();
    void kill();

}
