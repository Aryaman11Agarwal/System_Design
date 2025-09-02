package visitors.concretevisitors;

import patients.concretepatients.AdultPatient;
import patients.concretepatients.ChildPatient;
import patients.concretepatients.SeniorPatient;
import visitors.Visitor;

public class DiagnosisVisitor implements Visitor {

    @Override
    public void visit(AdultPatient adultPatient) {
        System.out.println("Diagnosing adult patient");
    }

    @Override
    public void visit(ChildPatient childPatient) {
        System.out.println("Diagnosing child patient");
    }

    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("Diagnosing senior patient");
    }
}
