package com.company;

import java.util.ArrayList;

public class QueueMangementSystem {
    private int System_ID;
    ArrayList<Ticket>Tickets=new ArrayList<Ticket>();
    ArrayList<Queue>ListofQueue=new ArrayList<Queue>();
    public QueueMangementSystem(int System_ID){
        this.System_ID=System_ID;
    }

    public void Issue_Ticket(){
        //print Issues tickets and number of tickets

    }
    public void Display_Avalibility(){
        // Display if there is a available position

    }
    public boolean Check_Avalibility(){
        //Checks if there is available position and print True or False
    return Check_Avalibility();}

    public boolean addTicket(Ticket T){
        //Add tickets to the ticket List
        return (this.Tickets.add(T));

    }
    public boolean removeTicket(Ticket T){

        //remove Ticket fromt the Ticket List
        return (this.Tickets.add(T));
    }
    public boolean addQueue(Queue Q){
        //Add Queue to the Queue List
        return (this.ListofQueue.add(Q));

    }
    public boolean removeQueue(Queue Q){
        //Remove Queues from Queue List
        return (this.ListofQueue.add(Q));
    }
}
