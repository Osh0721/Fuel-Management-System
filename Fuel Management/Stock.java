package com.company;

public class Stock {
    private double Fuel_Count;

    public Stock(double Fuel_Count){
        this.Fuel_Count=Fuel_Count;
    }

    public Stock() {
        int Avaliable_Stocks=25000;

    }

    public double getFuel_Count() {
        return Fuel_Count;
    }

    public void setFuel_Count(double fuel_Count) {
        Fuel_Count = fuel_Count;
    }



    }

