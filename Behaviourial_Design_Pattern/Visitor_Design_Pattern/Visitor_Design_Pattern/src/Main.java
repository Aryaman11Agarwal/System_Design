import patients.concretepatients.AdultPatient;
import patients.concretepatients.ChildPatient;
import patients.concretepatients.SeniorPatient;
import visitors.Visitor;
import visitors.concretevisitors.BillingVisitor;
import visitors.concretevisitors.DiagnosisVisitor;

public class Main {
    public static void main(String[] args) {

        ChildPatient childPatient=new ChildPatient();
        AdultPatient adultPatient=new AdultPatient();
        SeniorPatient seniorPatient=new SeniorPatient();

        Visitor billingVisitor=new BillingVisitor();
        Visitor diagnosisVisitor=new DiagnosisVisitor();


        childPatient.accept(billingVisitor);
        adultPatient.accept(billingVisitor);
        seniorPatient.accept(billingVisitor);


        childPatient.accept(diagnosisVisitor);
        adultPatient.accept(diagnosisVisitor);
        seniorPatient.accept(diagnosisVisitor);


    }
}