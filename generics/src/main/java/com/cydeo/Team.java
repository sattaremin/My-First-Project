package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {


    private String name;

    private List<T> members = new ArrayList();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T player){


        if (members.contains(((Player)player).getName()+" is already in the team")){
            return false;
        }else {
            members.add(player);
            System.out.println(((Player)player).getName()+"pickde for team"+this.name);
            return true;
        }


    }




}
