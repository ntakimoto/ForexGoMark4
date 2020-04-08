package com.uppergain.mark4.framework.Command;

import com.uppergain.mark4.framework.Command.Client.Command;

public class BattleControl {

    Command slot;

    public BattleControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void userOperation(){
        slot.execute();
    }
}
