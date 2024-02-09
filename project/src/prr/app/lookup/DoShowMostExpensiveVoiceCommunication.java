package prr.app.lookup;

import prr.core.Network;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoShowMostExpensiveVoiceCommunication extends Command<Network> {
    DoShowMostExpensiveVoiceCommunication(Network receiver) {
        super("mostra a comunicação de voz mais cara", receiver);
    }

    @Override
    protected final void execute() throws CommandException {
        String comm = _receiver.getMostExpensiveVoiceComm();
        if ( comm != null)
            _display.popup(comm);
    }
}


