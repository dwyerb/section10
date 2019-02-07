package com.digitalglobe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Tampa Theater",8,12);
        theater.getSeats();
        if(theater.reserveSeat("H11"))
        {
            System.out.println("please pay");
        }
        else
        {
            System.out.println("seat is taken");
        }

        League<Team<FootballPlayer>> NFL = new League<>("National Football League");
        Team<FootballPlayer> bucs = new Team<>("Buccaneers");
        Team<FootballPlayer> saints = new Team<>("Saints");

        NFL.add(bucs);
        NFL.add(saints);




        //adeladeCrows.matchResult(tbRays, 1,1);

    }

}
