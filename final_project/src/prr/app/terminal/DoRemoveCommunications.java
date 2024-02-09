package prr.app.terminal;

import prr.core.Network;
import prr.core.exception.UnknownTerminalKeyException;
import prr.core.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;

class DoRemoveCommunications extends TerminalCommand {

    DoRemoveCommunications(Network context, Terminal terminal) {
        super("Remover comunicações", context, terminal);
        addIntegerField("valor", Message.paymentValue());
    }

    @Override
    protected final void execute() throws CommandException {
        int valor = integerField("valor");
        if (_receiver.removeCommunicationsByValue(valor) != null)
            _display.popup(_receiver.removeCommunicationsByValue(valor).toString());
        else
            _display.popup("nao existem comunicacoes feitas");

    }dsdsad
}
