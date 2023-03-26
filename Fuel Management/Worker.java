package com.company;

import java.util.ArrayList;

public class Worker {
    private int Worker_ID;
    private String Working_Station;
    ArrayList<Payment>Payments=new ArrayList<Payment>();
    public Worker(int Worker_ID,String Working_Station){
        this.Worker_ID=Worker_ID;
        this.Working_Station=Working_Station;
    }

    public int getWorker_ID() {
        return Worker_ID;
    }

    public void setWorker_ID(int worker_ID) {
        Worker_ID = worker_ID;
    }

    public String getWorking_Station() {
        return Working_Station;
    }

    public void setWorking_Station(String working_Station) {
        Working_Station = working_Station;
    }

    public boolean addpayment(Payment P){
        //Add payment for payment list
        return (this.Payments.add(P));

    }
    public boolean removePayment(Payment P){
        //Remove payment from payment list
        return (this.Payments.add(P));
    }
}
