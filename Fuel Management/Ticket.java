package com.company;

public class Ticket {
    private int Ticket_no;
    private int Ticket_count;

    public Ticket(int Ticket_no,int Ticket_count){
        this.Ticket_count=Ticket_count;
        this.Ticket_no=Ticket_no;

    }

    public int getTicket_no() {
        //Prints the ticket number
        return Ticket_no;
    }

    public void setTicket_no(int ticket_no) {
        Ticket_no = ticket_no;
    }

    public int getTicket_count() {
        return Ticket_count;
    }

    public void setTicket_count(int ticket_count) {
        Ticket_count = ticket_count;
    }
}
