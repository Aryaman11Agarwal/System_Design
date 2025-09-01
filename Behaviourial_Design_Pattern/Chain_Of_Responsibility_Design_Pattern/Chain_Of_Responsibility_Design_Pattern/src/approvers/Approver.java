package approvers;

public abstract class Approver {

    protected Approver nextApprover;

    //can only be used by classes overriding in different package
    public void setNextApprover(Approver nextApprover){
        this.nextApprover=nextApprover;


    }

    public abstract void  handleRequest(int leaveDays);
}
