package prr.app.client;

import prr.core.Network;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoRemoveClientByTaxId extends Command<Network> {
    DoRemoveClientByTaxId(Network receiver) {
        super("Remover Cliente", receiver);
        addIntegerField("taxID",Message.taxId());
    }

    @Override
    protected final void execute() throws CommandException {
        int taxId = integerField("taxID");
        if ( _receiver.removeClientByTaxId(taxId))
            _display.popup("Sucess");
        else
            _display.popup("Failed");
    }
}
