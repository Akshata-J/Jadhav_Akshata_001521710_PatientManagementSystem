/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class EncounterHistory {
    
    private List<Encounter> encounters;
    

    public EncounterHistory() {
        encounters = new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void addEncounter(Encounter encounter) {
        this.encounters.add(encounter);
    }

    @Override
    public String toString() {
        return "EncounterHistory{" + "encounter=" + encounters + '}';
    }
    
    
    
    
}
