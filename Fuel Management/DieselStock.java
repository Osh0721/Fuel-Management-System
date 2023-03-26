package com.company;

class DieselStock extends Stock{
    private int remaining_amount;
    private String Type;

    public DieselStock(int remaining_amount, String Type){
        super();
        this.remaining_amount=remaining_amount;
        this.Type=Type;
    }
}
