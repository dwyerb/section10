package com.digitalglobe;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        Theater theater = new Theater("Tampa Theater",8,12);
//        theater.getSeats();
//        if(theater.reserveSeat("H11"))
//        {
//            System.out.println("please pay");
//        }
//        else
//        {
//            System.out.println("seat is taken");
//        }
//
//        League<Team<FootballPlayer>> NFL = new League<>("National Football League");
//        Team<FootballPlayer> bucs = new Team<>("Buccaneers");
//        Team<FootballPlayer> saints = new Team<>("Saints");
//
//        NFL.add(bucs);
//        NFL.add(saints);
        //adeladeCrows.matchResult(tbRays, 1,1);

        int x = 98;
        int y = 0;

        System.out.println(dividedLBYL(x,y));
        System.out.println(divideEAFP(x,y));
        int p = getInt();
        System.out.println("x is " + p);

    }

    private static int dividedLBYL(int x, int y)
    {
        if(y !=0)
        {
            return x/y;
        }
        else
        {
            return 0;
        }
    }
    private static int divideEAFP(int x, int y)
    {
        try
        {
            return x/y;
        }catch (ArithmeticException e)
        {
            return 0;
        }
    }
    private static int getInt()
    {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

}
