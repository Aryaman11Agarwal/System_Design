import approvers.Approver;
import approvers.concreteapprovers.Director;
import approvers.concreteapprovers.Manager;
import approvers.concreteapprovers.Supervisor;

public class Main{



    public static void main(String[] args) {


        Approver manager=new Manager();
        Approver supervisor=new Supervisor();

        Approver director=new Director();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);


        supervisor.handleRequest(3);

        supervisor.handleRequest(5);
        supervisor.handleRequest(8);

        supervisor.handleRequest(12);
        supervisor.handleRequest(19);

    }
}