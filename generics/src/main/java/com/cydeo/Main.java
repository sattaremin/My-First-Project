package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> items = new ArrayList<Integer>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDoubled(items);


        System.out.println("*******************************");

        FootBallPlayer joe = new FootBallPlayer("joe");
        BaseBallPlayer pat = new BaseBallPlayer("pat");
        SoccerPlayer berkan = new SoccerPlayer("berkan");

        Team<SoccerPlayer> liverPool = new Team("Liverpool");
        liverPool.addPlayer(berkan);

    }

    private static void printDoubled(ArrayList<Integer> items){
        for (int i : items){
            System.out.println(i*2);
        }
    }

}
