package com.uppergain.mark4.framework.Command.ConcreteCommand;

import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.ExitPosition;

public class ExitPositionCommand implements Command {

    ExitPosition exitPosition;

    public ExitPositionCommand(ExitPosition exitPosition){
        this.exitPosition = exitPosition;
    }

    @Override
    public void execute() {
        exitPosition.delete();
    }
}
