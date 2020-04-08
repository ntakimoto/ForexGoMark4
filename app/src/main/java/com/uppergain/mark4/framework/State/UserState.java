package com.uppergain.mark4.framework.State;

/**
 * 各会員状態に関する処理クラス<br>
 * 基底GoF:Stateパターン
 *
 * @author Natsumi Takimoto
 * @version 0.0.1
 * @since 2020-02-14
 */
public class UserState {

    State temporaryMemberState;
    State freeMemberState;
    State paidMemberState;
    State unpaidMemberState;
    State noPositionMemberState;

    State state = null;

    public UserState(){}

    /**
     * 当クラスが呼ばれる際のパラメータ<br>
     * 0:仮会員または退会会員<br>
     * 1:無料会員または休会会員<br>
     * 2:有料会員<br>
     * 3:未納会員<br>
     * 4:保有するポジションが存在しない会員<br>
     * @param state
     */
    public UserState(String state) {
        switch (state) {
            case "0":
                temporaryMemberState = new TemporaryMemberState(this);
                setState(temporaryMemberState);
                break;
            case "1":
                freeMemberState = new FreeMemberState(this);
                setState(freeMemberState);
                break;
            case "2":
                paidMemberState = new PaidMemberState(this);
                setState(paidMemberState);
                break;
            case "3":
                unpaidMemberState = new UnpaidMemberState(this);
                setState(unpaidMemberState);
                break;
            case "4":
                noPositionMemberState = new NoPositionMemberState(this);
                setState(noPositionMemberState);
                break;
            default:
        }
    }

    void setState(State state){
        this.state = state;
    }

    public void register(){
       state.register();
    }

    public void change(){
        state.change();
    }

    public void entry(){
        state.entry();
    }

    public void exit(){
        state.exit();
    }

    public void browseVideos(){
        state.browseVideos();
    }

    public void sell(){
        state.sell();
    }

    public void buy(){
        state.buy();
    }

    public boolean confirm(){
        return state.confirm();
    }

    public void viewAdd(){
        state.viewAdd();
    }

    public void closed(){
        state.closed();
    }

    public void kill(){
        state.kill();
    }

    /**
     * 仮会員または退会会員を返す
     * @return
     */
    public State getTemporaryMemberState() {
        return temporaryMemberState;
    }

    /**
     * 無料会員または休会会員を返す
     * @return
     */
    public State getFreeMemberState() {
        return freeMemberState;
    }

    /**
     * 有料会員を返す
     * @return
     */
    public State getPaidMemberState() {
        return paidMemberState;
    }

    /**
     * 未納状態の会員を返す
     * @return
     */
    public State getUnpaidMemberState() {
        return unpaidMemberState;
    }

    /**
     * 保有ボジションが存在していない場合の会員を返す
     * @return
     */
    public State getNoPositionMemberState() {
        return noPositionMemberState;
    }

    /**
     * 現在の会員状態を返す
     * @return
     */
    public State getState() {
        return state;
    }
}
