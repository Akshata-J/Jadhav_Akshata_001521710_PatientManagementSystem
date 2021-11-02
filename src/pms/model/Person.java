/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class Person {
    
    private int personId;
    private String name;
    //private int age;
    private Date dateOfBirth;
    private long phoneNumber;
    private String gender;
    private String bloodGroup;
    private String email;
    private float height;
    private float weight;
    House house;

    public Person() {
        house = new House();
    }   
    
    public Person(String name, String dob, String gender, String bG, String email, 
            String phoneNumber, String height, String weight, String hNo, String community,
            String city, String zipCode) throws ParseException {
    
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        this.dateOfBirth = sdf.parse(dob);
        this.gender = gender;
        this.bloodGroup = bG;
        this.email = email;
        this.phoneNumber = Long.parseLong(phoneNumber);
        this.height = Float.parseFloat(height);
        this.weight = Float.parseFloat(weight);
        house = new House();
        house.setHouseNumber(Integer.parseInt(hNo));
        house.setCommunity(community);
        house.setCity(city);
        house.setZip(Integer.parseInt(zipCode));
    }   

    public Person(String name, String dob, String gender, String bG, String email, 
            long phoneNumber, float height, float weight, int hNo, String community,
            String city, int zipCode) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        this.dateOfBirth = sdf.parse(dob);
        this.gender = gender;
        this.bloodGroup = bG;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.weight = weight;
        house = new House();
        house.setHouseNumber(hNo);
        house.setCommunity(community);
        house.setCity(city);
        house.setZip(zipCode);
    }   

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + personId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", height=" + height + ", weight=" + weight + ", house=" + house + '}';
    }
    
  
}
