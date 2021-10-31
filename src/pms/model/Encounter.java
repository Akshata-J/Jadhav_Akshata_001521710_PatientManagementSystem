/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.model;

import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class Encounter extends VitalSigns{
    
    private Date visitDate;
    private boolean normal = Boolean.TRUE;

    public Encounter() {
        super();
    }

    public Encounter(Date visitDate) {
        this.visitDate = visitDate;
    }

    public Encounter(Date visitDate, int hBloodPressure, int lBloodPressure, int heartRate, int oxygenLevel, float temperature) {
        super(hBloodPressure, lBloodPressure, heartRate, oxygenLevel, temperature);
        this.visitDate = visitDate;
    }
    
    
    @Override
    public void sethBloodPressure(int hBloodPressure) {
        if(hBloodPressure>140 || hBloodPressure<100){
            normal = false;
        }
        super.sethBloodPressure(hBloodPressure);
    }
    
    @Override
    public void setlBloodPressure(int lBloodPressure) {
        if(lBloodPressure>90 || lBloodPressure<60){
            normal = false;
        }
        super.sethBloodPressure(lBloodPressure);
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    @Override
    public String toString() {
        return "Encounter{" + "visitDate=" + visitDate + ", normal=" + normal + '}';
    }

   

    
    
    

}
