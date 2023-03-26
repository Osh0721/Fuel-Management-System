package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    private int Queue_No;


    public int getQueue_No() {
        return Queue_No;
    }

    public void setQueue_No(int queue_No) {
        Queue_No = queue_No;
    }



    ArrayList<Customer>Customers=new ArrayList<Customer>();
    public Queue(int Queue_No){
        this.Queue_No=Queue_No;
    }
    public boolean addcustomer(Customer C){
        //Add customer to the Customer List


        Scanner newscan= new Scanner(System.in);

        System.out.println("Vehicle Type:");
        String Vehicle_Type=newscan.nextLine();
        System.out.println("Enter the QR number:");
        int QR_number=newscan.nextInt();
        System.out.println("Enter the ID Number:");
        int ID_number=newscan.nextInt();
        System.out.println("Enter the Fuel Type (Octane or Diesel):");
        String Fuel_type=newscan.nextLine();
        System.out.println("Amount of Fuel pumped");
        int Amount_fuel=newscan.nextInt();
        System.out.println("Amount that Customer payed:");
        int payed_amount=newscan.nextInt();

        Customer NewCustomer=new Customer(QR_number,ID_number,Vehicle_Type,Fuel_type,Amount_fuel);
        Customers.add(NewCustomer);


        return (this.Customers.add(C));

    }
    public boolean removecustomer(Customer C){
        //Remove customer from Customer List
        return (this.Customers.add(C));
    }

}
