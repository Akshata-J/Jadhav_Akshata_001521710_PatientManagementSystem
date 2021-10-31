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
public class Community {
    
    private List<House> houses;
    
    public Community() {
        houses = new ArrayList<>();
    }

    public List<House> getHouses() {
        return houses;
    }

    public void addCommunityHouse(House house) {
        houses.add(house);
    }
    
    public boolean removeHouse(House house){
        return houses.remove(house);
    }
        
}
