package behavioral.command.undoable;

public interface UndoableCommand extends Command {
    void unexecute();
}
