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
public class House {
    
    private int houseNumber;
    private String community;
    private String city;
    private int zip;

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return houseNumber + ", " + community + ", " + city + ", " + zip;
    }
//    public String toString() {
//        return "House{" + "houseNumber=" + houseNumber + ", unitNumber=" + unitNumber + ", streetName=" + streetName + ", zip=" + zip + '}';
//    }

}
