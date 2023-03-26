package com.company;

class OctaneFuelDispener implements FuelDispenser {
    private String type;
    private double Unit_price;

    private double Amount;

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public OctaneFuelDispener(String type, double Unit_price){
        this.type=type;
        this.Unit_price=Unit_price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getUnit_price() {
        return Unit_price;
    }

    public void setUnit_price(double unit_price) {
        Unit_price = unit_price;
    }

    @Override
    public void TotalProfit() {
        //Calculate the total profit and print it

    }

    @Override
    public void Checksfuelleft() {
        //Checks if there is fuel and print it
    }

    @Override
    public void Total_fuel_Dispensed_per_vehicle() {
        //Print Total_fuel_Dispenser per vehicle
    }

    @Override
    public void The_vehicle_That_Received_the_largest_Amount_of_Fuel() {
        //Checks which Vehicle received the largest amount of fuel
    }

    @Override
    public void Total_number_of_vehicle_that_served_and_Amount_of_fuel() {
     //prints the total number of vehicle that served and amount of fuel from this DieselFuelDispenseer
    }

    @Override
    public void the_total_income_of_theGasStation_per_day_per_fuel_type() {
     //prints the Total income of the gasstation per day and per fuel tyoe

    }
}
