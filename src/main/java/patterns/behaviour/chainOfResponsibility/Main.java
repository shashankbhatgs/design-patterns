package patterns.behaviour.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();

        supervisor.setNextApprover(manager);
        int leaves = 10;

        System.out.println("Employee requests " + leaves + " days of leave");
        supervisor.processLeaveRequest(leaves);
    }
}
