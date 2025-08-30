package behavioral.command.undoable;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private final HTMLDocument document;
    private final History history;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
