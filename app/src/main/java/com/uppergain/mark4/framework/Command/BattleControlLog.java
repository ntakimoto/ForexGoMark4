package com.uppergain.mark4.framework.Command;

import com.uppergain.mark4.framework.Command.Client.CurrencyPair;
import com.uppergain.mark4.framework.Command.Client.Display;
import com.uppergain.mark4.framework.Command.Client.ExitPosition;
import com.uppergain.mark4.framework.Command.Client.FireBasePosition;
import com.uppergain.mark4.framework.Command.Client.Lots;
import com.uppergain.mark4.framework.Command.Client.Monster;
import com.uppergain.mark4.framework.Command.ConcreteCommand.CurrencyPairCommand;
import com.uppergain.mark4.framework.Command.ConcreteCommand.DisplayCommand;
import com.uppergain.mark4.framework.Command.ConcreteCommand.ExitPositionCommand;
import com.uppergain.mark4.framework.Command.ConcreteCommand.FireBasePositionCommand;
import com.uppergain.mark4.framework.Command.ConcreteCommand.LotsCommand;
import com.uppergain.mark4.framework.Command.ConcreteCommand.MonsterCommand;

public class BattleControlLog {

    public void run(){

        BattleControl control = new BattleControl();

        //エントリー
        FireBasePosition position = new FireBasePosition();
        FireBasePositionCommand entryPosition = new FireBasePositionCommand(position);
        control.setCommand(entryPosition);
        control.userOperation();

        //決済

        //画面ロック
        Display display = new Display();
        DisplayCommand onoff = new DisplayCommand(display);
        control.setCommand(onoff);
        control.userOperation();

        //部分決済
        ExitPosition position1 = new ExitPosition();
        ExitPositionCommand exitPosition = new ExitPositionCommand(position1);
        control.setCommand(exitPosition);
        control.userOperation();

        //モンスター情報
        Monster monster = new Monster();
        MonsterCommand info = new MonsterCommand(monster);
        control.setCommand(info);
        control.userOperation();

        //ロット切替
        Lots lots = new Lots();
        LotsCommand lot = new LotsCommand(lots);
        control.setCommand(lot);
        control.userOperation();

        //通貨ペア切替え
        CurrencyPair currencyPair = new CurrencyPair();
        CurrencyPairCommand pair = new CurrencyPairCommand(currencyPair);
        control.setCommand(pair);
        control.userOperation();
    }
}
