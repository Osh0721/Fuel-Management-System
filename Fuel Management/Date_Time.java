package com.company;

import java.sql.Date;

public class Date_Time {
    private String Date;
    private String Time;

    public Date_Time(String Date,String Time){
        this.Date=Date;
        this.Time=Time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
