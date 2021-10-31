/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class PatientDirectory {
    
    private HashMap<Integer, Patient> patients;
    private HashMap<Integer, Integer> personPatientId;
   
    public PatientDirectory() {
        patients = new HashMap<Integer, Patient>();
        personPatientId = new HashMap<Integer, Integer>(); 
    }

    public Patient getPatient(int id) {
        return patients.get(id);
    }
    
    public List<Patient> getPatients() {
        return new ArrayList<>(patients.values());
    }
    
    public int getPatientId(int id) {
        return personPatientId.get(id);
    }
    
    public List<Integer> getPatientIDs() {
        return new ArrayList(patients.keySet());
    }
    
    public List<Integer> getPersonIDs() {
        return new ArrayList(personPatientId.keySet());
    }
    
    public int generatePatientId(){
        int id;
        do{ 
          id = (int)((Math.random() * (59999999 - 50000000)) + 50000000); 
        }while(patients.keySet().contains(id));
        System.out.println("Patient ID:"+id);
        return id;
    }

    public int addPatient(Patient patient) {
        int id = this.generatePatientId();
        patient.setPatientID(id);
        this.patients.put(id, patient);
        this.personPatientId.put(patient.getPersonId(), id);
        return id;
    }
    
    public void removePatient(int id) {
        this.personPatientId.remove(this.patients.get(id).getPersonId());
        this.patients.remove(id);
    }

    @Override
    public String toString() {
        return "PatientDirectory{" + "patients=" + patients+'}';
    }

 
}
