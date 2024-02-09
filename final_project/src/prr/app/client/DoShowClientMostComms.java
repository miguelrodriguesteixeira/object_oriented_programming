import prr.core.Network;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoShowClientMostComms extends Command<Network> {
    DoShowClientMostComms(Network receiver) {
        super("Cliente com mais comunicações", receiver);
    }

    @Override
    protected final void execute() throws CommandException {
        /*String comm = _receiver.getm();
        if ( comm != null)
                _display.popup(comm);*/
    }
}
