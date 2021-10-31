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
public class VitalSigns {
    
    private int hBloodPressure;
    private int lBloodPressure;
    private int heartRate;
    private int oxygenLevel;
    private float temperature;

    public VitalSigns() {
    }
    

    public VitalSigns(int hBloodPressure, int lBloodPressure, int heartRate, int oxygenLevel, float temperature) {
        this.hBloodPressure = hBloodPressure;
        this.lBloodPressure = lBloodPressure;
        this.heartRate = heartRate;
        this.oxygenLevel = oxygenLevel;
        this.temperature = temperature;
    }

    public int gethBloodPressure() {
        return hBloodPressure;
    }

    public void sethBloodPressure(int hBloodPressure) {
        
        this.hBloodPressure = hBloodPressure;
    }

    public int getlBloodPressure() {
        return lBloodPressure;
    }

    public void setlBloodPressure(int lBloodPressure) {
        this.lBloodPressure = lBloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "hBloodPressure=" + hBloodPressure + ", lBloodPressure=" + lBloodPressure + ", heartRate=" + heartRate + ", oxygenLevel=" + oxygenLevel + ", temperature=" + temperature + '}';
    }

   
    
    
}
