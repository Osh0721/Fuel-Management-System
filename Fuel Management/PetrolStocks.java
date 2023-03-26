package com.company;

class PetrolStocks extends Stock{
    private int remaining_amount;
    private String Type;

   public PetrolStocks(int remaining_amount,String Type){
       super();
       this.remaining_amount=remaining_amount;
        this.Type=Type;
    }

}
