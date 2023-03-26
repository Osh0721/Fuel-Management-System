package com.company;

import java.util.ArrayList;

public class Admin {
    private boolean is_empty;
    ArrayList<Stock>Stocks=new ArrayList<Stock>();
    public Admin(boolean is_empty){
        this.is_empty=is_empty;

    }

    public boolean Is_empty() {
        return is_empty;
    }

    public void setIs_empty(boolean is_empty) {
        this.is_empty = is_empty;
    }
    public void Check_fuel_availbility(){

    }
    public void Restock() {
        Stock Stocks = new Stock();
        double Avalible_Stock = Stocks.getFuel_Count();
        if (Avalible_Stock <= 500) {
            //Updates the repository
        }
        else{
            //Continue pumping
        }
    }
    public boolean addStock(Stock S){
        //Add stocks to the  Stock List
        return (this.Stocks.add(S));

    }
    public boolean removeStocks(Stock S){
        //remove Stocks from Stock List
        return (this.Stocks.add(S));
    }
}
