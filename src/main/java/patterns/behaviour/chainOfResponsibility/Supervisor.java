package patterns.behaviour.chainOfResponsibility;

public class Supervisor extends Approver{

    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 3) {
            System.out.println("approved");
        } else if(nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}

