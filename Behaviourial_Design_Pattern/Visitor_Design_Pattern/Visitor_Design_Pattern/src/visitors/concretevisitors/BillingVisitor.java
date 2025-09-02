package visitors.concretevisitors;

import patients.concretepatients.AdultPatient;
import patients.concretepatients.ChildPatient;
import patients.concretepatients.SeniorPatient;
import visitors.Visitor;

public class BillingVisitor implements Visitor {

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Billing adult patient");
    }

    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Billing child patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Billing senior patient");
    }
}
