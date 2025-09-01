package approvers.concreteapprovers;

import approvers.Approver;

public class Supervisor extends Approver {


    public void handleRequest(int leaveDays){
        if(leaveDays>3){
            nextApprover.handleRequest(leaveDays);
        }
        else{
            System.out.println("Leave approved by supervisor");
        }
    }
}
