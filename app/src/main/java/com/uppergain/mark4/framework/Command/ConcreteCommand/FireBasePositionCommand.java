package com.uppergain.mark4.framework.Command.ConcreteCommand;

import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.FireBasePosition;

public class FireBasePositionCommand implements Command {

    FireBasePosition fireBasePosition;

    public FireBasePositionCommand(FireBasePosition fireBasePosition){
        this.fireBasePosition = fireBasePosition;
    }

    @Override
    public void execute() {
        fireBasePosition.insert();
    }
}
