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
public class City {
    
    private String name;
    private HashMap<String, Community> communities;

    public City() {
        communities = new HashMap<String, Community>();
    }
    public City(String name) {
        communities = new HashMap<String, Community>();
        this.name = name;
    }
        
    public List<String> getCommunityNames() {
        return new ArrayList<>(communities.keySet());
    }

    public Community getCommunity(String communityName) {
        communityName = communityName.toLowerCase();
        if(communities.get(communityName) == null){
            communities.put(communityName, new Community());
        }
        return communities.get(communityName);
    }

    public void addCityCommunities(String communityName, Community c) {
        communityName = communityName.toLowerCase();
        if(communities.get(communityName) == null){
            communities.put(communityName, c);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
