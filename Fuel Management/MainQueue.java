package com.company;

import java.util.Scanner;

public class MainQueue extends Queue {
    int Queue_length;
    public MainQueue(int Queue_No,int Queue_length) {
        super(Queue_No);

        this.Queue_length=Queue_length;

    }

    public int getQueue_length() {
        return Queue_length;
    }

    public void setQueue_length(int queue_length) {
        Queue_length = queue_length;
    }

    public boolean Check_Ticket(){

        return Check_Ticket();
    }
    public void Avalible_Vehicle(){
        Scanner SCN=new Scanner(System.in);
        System.out.println("Enter the Queue number:");
        int Queue_No=SCN.nextInt();
        System.out.println("Enter the Queue length:");
        int Queue_length=SCN.nextInt();

        MainQueue Main_Queue_Detail=new MainQueue(Queue_No,Queue_length);
        Queue Customer =new Queue(Queue_No);







    }
}
