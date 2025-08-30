package behavioral.command.undoable;

import java.util.Stack;

public class History {
    private final Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand command) {
        commands.push(command);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public boolean isEmpty() {
        return commands.isEmpty();
    }
}
