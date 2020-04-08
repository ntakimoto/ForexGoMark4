package com.uppergain.mark4.framework.Command.ConcreteCommand;

import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.PartExitPosition;

public class PartExitPositionCommand implements Command {

    PartExitPosition partExitPosition;

    public PartExitPositionCommand(PartExitPosition partExitPosition){
        this.partExitPosition = partExitPosition;
    }

    @Override
    public void execute() {
        partExitPosition.decideLot();
    }
}
