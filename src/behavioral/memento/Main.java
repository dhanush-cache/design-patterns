package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Version 1");
        history.push(editor.createState());

        editor.setContent("Version 2");
        history.push(editor.createState());

        editor.setContent("Version 3");
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }
}
