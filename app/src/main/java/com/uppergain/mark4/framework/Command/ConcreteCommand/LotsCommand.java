package com.uppergain.mark4.framework.Command.ConcreteCommand;


import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.Lots;

public class LotsCommand implements Command {

    Lots lots;

    public LotsCommand(Lots lots){
        this.lots = lots;
    }

    @Override
    public void execute() {
        lots.chenged();
    }
}
