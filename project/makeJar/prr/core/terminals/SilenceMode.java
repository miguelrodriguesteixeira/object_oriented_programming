package prr.core.terminals;


import prr.core.exception.AlreadyInModeException;
import prr.core.exception.DestinationSilentException;
import prr.core.terminals.Terminal.TerminalMode;

class SilenceMode extends TerminalMode {

    //Silence can go to Idle(when told to idle),Busy(start of Communication),Off(when turning off)

    public SilenceMode(Terminal terminal) {
        terminal.super();
        canSendNotification();
    }

    @Override
    public void toOff() {
        setPreviousMode(new SilenceMode(getTerminal()));
        setMode(new OffMode(getTerminal()));
    }

    @Override
    public void toIdle() {
        setPreviousMode(new SilenceMode(getTerminal()));
        setMode(new IdleMode(getTerminal()));
    }

    @Override
    public void toBusy() {
        setPreviousMode(new SilenceMode(getTerminal()));
        setMode(new BusyMode(getTerminal()));
    }

    @Override
    public void toSilence() throws AlreadyInModeException {
        throw new AlreadyInModeException();
    }

    @Override
    public void getCall(Terminal from) throws DestinationSilentException {
        attach(from.getOwner());
        from.getTerminalMode().toPrevious();
        throw new DestinationSilentException(getTerminal().getId());
    }


    @Override
    public String toString() {
        return "SILENCE";
    }
}