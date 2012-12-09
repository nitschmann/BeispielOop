package beispieloop;

/**
 * Die Personen Basis-Class 
 * 
 * @author fnitschmann
 * @version 0.1 
 */
public class Person {
    
    //Private Attribute (Name und Vorname) 
    private String name;
    private String firstName;
    
    //Öffentliches Attribut Alter
    public int age;
    
    //Initialisierungs-Method 
    public Person(String ln, String fn) {
        this.name = ln; 
        this.firstName = fn; 
    }
    
    //Namen manuell setzen
    public void setName(String ln, String fn) {
        this.name = ln; 
        this.firstName = fn; 
    }
    
    //Ausgabe des Vor-und Nachnamen
    public String fullName() {
        return (name + " " + firstName);
    }  
    
}