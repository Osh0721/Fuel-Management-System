package com.company;

public class Payment {
    private double payment;
    public Payment(double payment){
        this.payment=payment;

    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double Check_Balance(){
       //Checks the balance and return it
        return payment;
    }
}
