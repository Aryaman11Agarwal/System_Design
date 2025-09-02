package patients.concretepatients;

import patients.Patient;

import visitors.Visitor;


public class SeniorPatient implements Patient {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}