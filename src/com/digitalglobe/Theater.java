package com.digitalglobe;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by Brendan on 2/4/2019.
 */
public class Theater {
    private final String theaterName;
    private List<Seat> seats = new LinkedList<>();

    public Theater(String name, int numRows, int seatsPerRow)
    {
        this.theaterName = name;

        int lastRow = 'A' + (numRows-1);
        for (char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++)
            {
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber)
    {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >=0)
        {
            return seats.get(foundSeat).reserve();
        }
        else
        {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

    }
     public void getSeats()
     {
         for(Seat seat: seats)
         {
             System.out.println(seat.getSeatNumber());
         }
     }

     private class Seat implements Comparable<Seat>
     {
         private final String seatNumber;
         private boolean reserved = false;

         public Seat(String seatNumber) {
             this.seatNumber = seatNumber;
         }

         @Override
         public int compareTo(Seat seat)
         {
             return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
         }

         public boolean reserve()
         {
             if(!this.reserved)
             {
                 this.reserved = true;
                 System.out.println("Seat " + seatNumber + " is reserved");
                 return true;
             }
             else
             {
                 return false;
             }
         }
         public boolean cancel()
         {
             if(this.reserved)
             {
                 this.reserved = false;
                 System.out.println("Reservation of seat " + seatNumber + " has been canceleld");
                 return true;
             }
             else
             {
                 return false;
             }
         }

         public String getSeatNumber()
         {
             return seatNumber;
         }
     }
}
