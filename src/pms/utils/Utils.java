/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pms.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import pms.model.Patient;
import pms.model.Person;

/**
 *
 * @author akshatajadhav
 */
public class Utils {

    public static Patient personToPatient(Person person) {
        Patient patient = new Patient();
        patient.setBloodGroup(person.getBloodGroup());
        patient.setDateOfBirth(person.getDateOfBirth());
        patient.setEmail(person.getEmail());
        patient.setGender(person.getGender());
        patient.setHeight(person.getHeight());
        patient.setWeight(person.getWeight());
        patient.setHouse(person.getHouse());
        patient.setName(person.getName());
        patient.setPersonId(person.getPersonId());
        patient.setPhoneNumber(person.getPhoneNumber());
        return patient;
    }

    public static Person patientToPerson(Patient patient) {
        Person person = new Person();
        person.setBloodGroup(patient.getBloodGroup());
        person.setDateOfBirth(patient.getDateOfBirth());
        person.setEmail(patient.getEmail());
        person.setGender(patient.getGender());
        person.setHeight(patient.getHeight());
        person.setWeight(patient.getWeight());
        person.setHouse(patient.getHouse());
        person.setName(patient.getName());
        person.setPersonId(patient.getPersonId());
        person.setPhoneNumber(patient.getPhoneNumber());
        return person;
    }

    public static int ageCalculator(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate birthday = zone.toLocalDate();
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();
    }
    
    public static void copyToClipboard(Object s){
        StringSelection selection = new StringSelection(String.valueOf(s));
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}
