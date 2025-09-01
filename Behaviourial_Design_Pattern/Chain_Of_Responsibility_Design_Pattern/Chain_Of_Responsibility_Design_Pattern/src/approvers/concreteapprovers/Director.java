package approvers.concreteapprovers;

import approvers.Approver;

public class Director extends Approver {

    public void handleRequest(int leaveDays){

        if(leaveDays>14){
            System.out.println("Leave rejected");
        }
        else{
            System.out.println("Leave approved by director");
        }
    }
}
