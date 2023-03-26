package com.company;

public class Customer {
    private int QR_Number;
    private int ID_no ;
    private String Vehicle_type;
    private String Fuel_Type;
    private int Amount_of_fuel;

    public int getAmount_of_fuel() {
        return Amount_of_fuel;
    }

    public void setAmount_of_fuel(int amount_of_fuel) {
        Amount_of_fuel = amount_of_fuel;
    }

    public String getVehicle_type() {
        return Vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        Vehicle_type = vehicle_type;
    }

    public String getFuel_Type() {
        return Fuel_Type;
    }

    public void setFuel_Type(String fuel_Type) {
        Fuel_Type = fuel_Type;
    }

    public Customer(int QR_Number, int ID_no, String Vehicle_type, String Fuel_type, int Amount_of_fuel){
        this.Vehicle_type=Vehicle_type;
        this.QR_Number=QR_Number;
        this.ID_no=ID_no;
        this.Fuel_Type=Fuel_type;
        this.Amount_of_fuel=Amount_of_fuel;
    }

    public int getQR_Number() {
        return QR_Number;
    }

    public void setQR_Number(int QR_Number) {
        this.QR_Number = QR_Number;
    }

    public int getID_no() {
        return ID_no;
    }

    public void setID_no(int ID_no) {
        this.ID_no = ID_no;
    }
}
