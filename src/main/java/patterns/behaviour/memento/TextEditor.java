package patterns.behaviour.memento;


public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Creates a memento/snapshot of the current state
    public Memento save() {
        return new Memento(text);
    }

    //restores the state from teh given memento
    public void restore(Memento memento) {
        this.text = memento.getText();
    }

}
