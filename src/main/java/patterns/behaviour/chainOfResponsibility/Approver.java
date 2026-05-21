package patterns.behaviour.chainOfResponsibility;


//build a chain of approvers (Manager, Senior, Lead, etc.)
abstract class Approver {
    protected Approver nextApprover;
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    //if you can't approve, send it to next approver

    //it's a bit different from STATE design pattern; it ends when some condition matches.
    // STATE -> when something is done, go to next state
    // when something is not done, go to next responsible person. Forwarding request

    public abstract void processLeaveRequest(int leaveDays);
}
