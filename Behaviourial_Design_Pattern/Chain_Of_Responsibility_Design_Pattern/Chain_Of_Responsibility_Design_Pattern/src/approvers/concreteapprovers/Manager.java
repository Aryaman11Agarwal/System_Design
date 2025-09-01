package approvers.concreteapprovers;

import approvers.Approver;

public class Manager extends Approver {

    public void handleRequest(int leaveDays){

        if(leaveDays>7){
            nextApprover.handleRequest(leaveDays);
        }
        else{
            System.out.println("Leave approved by manager");
        }
    }
}
