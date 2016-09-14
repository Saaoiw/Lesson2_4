package com.brainacad.laboratorys2_4;

/**
 * Created by Таня on 13.09.2016.
 * Create Emploee class with fields firstName, lastName, occupation, telephone and static field numberOfEmployees
 * and getters/setters.
 * Also class must have constructor, which will initialize class fields end increment numberOfEmployees.
 */
class Emploee{
    private String firstName;
    private String lastName;
    private String occupation;
    private long telephone;
    static int numberOfEmployees = 0;

    public Emploee(String firstName, String lastName, String occupation, long telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public Emploee() {
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Emploee.numberOfEmployees = numberOfEmployees;
    }


}
public class Laboratory2_4_4 {
}
