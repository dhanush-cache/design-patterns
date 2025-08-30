package behavioral.command.undoable;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello World");

        new BoldCommand(document, history).execute();
        new BoldCommand(document, history).execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
