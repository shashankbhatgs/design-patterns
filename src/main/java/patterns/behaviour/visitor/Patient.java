package patterns.behaviour.visitor;

interface Patient {
    void accept(Visitor visitor);
}
