package visitors;

import patients.concretepatients.AdultPatient;
import patients.concretepatients.ChildPatient;
import patients.concretepatients.SeniorPatient;

public interface Visitor {

    public void visit(ChildPatient childPatient);
    public void visit(AdultPatient adultPatient);
    public void visit(SeniorPatient seniorPatient);
}
