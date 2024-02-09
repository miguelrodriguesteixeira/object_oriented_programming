package prr.app.terminal;

import prr.core.Network;
import prr.core.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;


/**
 * Show balance.
 */
class DoShowTerminalBalance extends TerminalCommand {

    DoShowTerminalBalance(Network context, Terminal terminal) {
        super(Label.SHOW_BALANCE, context, terminal);
    }

    @Override
    protected final void execute() throws CommandException {
        _display.popup(Message.terminalPaymentsAndDebts(_receiver.getId(),
                Math.round(_receiver.getBalancePayments()),
                Math.round(_receiver.getBalanceDebt())));
    }
}
