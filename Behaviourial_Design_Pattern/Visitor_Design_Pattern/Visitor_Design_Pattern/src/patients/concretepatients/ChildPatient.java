package patients.concretepatients;

import patients.Patient;
import visitors.Visitor;

import javax.swing.*;

public class ChildPatient implements Patient {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
