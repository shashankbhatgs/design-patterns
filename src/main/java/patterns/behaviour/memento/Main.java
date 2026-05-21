package patterns.behaviour.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        HistoryEditor history = new HistoryEditor();

        editor.setText("Hello");
        System.out.println(editor.getText());

        history.push(editor.save());
        editor.setText("Hello world");
        System.out.println(editor.getText());

        history.push(editor.save());
    }
}
