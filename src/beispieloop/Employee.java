package beispieloop;

/**
 * Die Mitarbeiter-Class, welche die Class Peron erweitert und deren Eigenschaften hat 
 * 
 * @author fnitschmann
 * @version 0.1 
 */

public class Employee extends Person {
    
    //Die Mitarbeiter ID
    private String employeeId;
    
    //Initialisierungs-Method für die Class Employee
    public Employee(String ln, String fn, String EmpId, int a) {
        super(ln,fn); // Java ruft hier den Konstruktor der Oberklasse auf
        this.employeeId = EmpId;
        this.age = a;
        
    }
    
    //Ausgabe des privaten Attributes Mitarbeiter ID 
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    //Ausgabe der gesamten Informationen des Mitarbeiter
    public String printAll() {
        return (
                fullName() + " " +
                this.employeeId + " " +
                this.age);
    }
}
