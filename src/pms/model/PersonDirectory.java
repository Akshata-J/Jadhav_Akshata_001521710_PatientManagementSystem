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
public class PersonDirectory {

    private HashMap<Integer, Person> persons;

    public PersonDirectory() {
        persons = new HashMap<Integer, Person>();
    }

    public int generatePersonId() {
        int id;
        do {
            id = (int) ((Math.random() * (19999999 - 10000000)) + 10000000);
        } while (persons.keySet().contains(id));
        System.out.println("Person ID:"+id);

        return id;
    }

    public Person getPerson(int id) {
        return persons.get(id);
    }

    public List<Person> getPersons() {
        return new ArrayList(persons.values());
    }

    public List<Integer> getPersonIds() {
        return new ArrayList(persons.keySet());
    }

    public int addPerson(Person person) {
        int id = this.generatePersonId();
        person.setPersonId(id);
        this.persons.put(id, person);
        return id;
    }
    
    public void replacePerson(Person person){
        this.persons.put(person.getPersonId(), person);
    }

    @Override
    public String toString() {
        return "PersonDirectory{" + "persons=" + persons + '}';
    }

}
