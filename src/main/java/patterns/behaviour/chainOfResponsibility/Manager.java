package patterns.behaviour.chainOfResponsibility;

public class Manager extends Approver{

    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 7) {
            System.out.println("approved");
        } else if(nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
