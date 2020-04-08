package com.uppergain.mark4.framework.Command.ConcreteCommand;

import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.Display;

public class DisplayCommand implements Command {

    Display display;

    public DisplayCommand(Display display){
        this.display = display;
    }

    @Override
    public void execute() {
        /*
        if(Singleton.getInstance().getDisplay()){
            display.unlocked();
        }else {
            display.locked();
        }

         */
    }
}
