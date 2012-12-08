/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beispieloop;

/**
 *
 * @author fnitschmann
 */
public class Person {
    
    private String name;
    private String firstName;
    
    public int age;
    
    public Person(String ln, String fn) {
        name = ln; 
        firstName = fn; 
    }
    
    public void setName(String ln, String fn) {
        name = ln; 
        firstName = fn; 
    }
    
    public String fullName() {
        return (name + " " + firstName);
    }  
    
}