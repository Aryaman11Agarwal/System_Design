package patients;
import visitors.Visitor;

public interface Patient {

     void accept(Visitor visitor);
}
