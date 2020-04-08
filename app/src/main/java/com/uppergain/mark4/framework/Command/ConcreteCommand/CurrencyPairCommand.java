package com.uppergain.mark4.framework.Command.ConcreteCommand;


import com.uppergain.mark4.framework.Command.Client.Command;
import com.uppergain.mark4.framework.Command.Client.CurrencyPair;

public class CurrencyPairCommand implements Command {

    CurrencyPair currencyPair;

    public CurrencyPairCommand(CurrencyPair currencyPair){
        this.currencyPair = currencyPair;
    }

    @Override
    public void execute() {
        currencyPair.switched();
    }
}
