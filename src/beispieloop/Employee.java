package beispieloop;

/**
 * Die Mitarbeiter-Class, welche die Class Peron erweitert und deren Eigenschaften hat 
 * 
 * @author fnitschmann
 * @version 0.1 
 */

public class Employee extends Person {
    
    //
    private String employeeId;
    
    public Employee(String ln, String fn, String EmpId, int a) {
        
        super(ln,fn); // Java ruft hier den Konstruktor der Oberklasse auf
        employeeId = EmpId;
        age = a;
        
    }
    
    public String getEmployeeId() {
        return employeeId;
    }
    
    public String printAll() {
        return (
                fullName() + " " +
                employeeId + " " +
                age);
    }
}
