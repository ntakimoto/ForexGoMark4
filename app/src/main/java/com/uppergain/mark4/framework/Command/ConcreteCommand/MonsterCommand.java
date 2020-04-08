package com.uppergain.mark4.framework.Command.ConcreteCommand;

import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.Monster;

public class MonsterCommand implements Command {

    Monster monster;

    public MonsterCommand(Monster monster){
        this.monster = monster;
    }

    @Override
    public void execute() {
        monster.viewInfo();
    }
}
