package patterns.behaviour.visitor;

public class DiagnosisVisitor implements Visitor{
    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Diagnosing a child");
    }

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Diagnosing an adult");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Diagnosing a senior citizen");
    }
}
