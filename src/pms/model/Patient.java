/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.model;

/**
 *
 * @author akshatajadhav
 */
public class Patient extends Person {
    
    private int patientID;
    EncounterHistory encounterHistory;

    public Patient() {
        this.encounterHistory = new EncounterHistory();
    }
    
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientID=" + patientID + '}';
    }

    
    
}
