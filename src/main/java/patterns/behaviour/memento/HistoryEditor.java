package patterns.behaviour.memento;

import java.util.Stack;

//manager
public class HistoryEditor {
    private final Stack<Memento> history = new Stack<>();

    public void push(Memento memento) {
        history.push(memento);
    }

    public Memento pop() {
        if(!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
