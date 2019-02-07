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



        //adeladeCrows.matchResult(tbRays, 1,1);

    }

}
