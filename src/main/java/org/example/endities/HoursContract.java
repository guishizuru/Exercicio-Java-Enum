package org.example.endities;

import java.util.Date;

public class HoursContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;


    public HoursContract(){}

    public HoursContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
    public Date getDate() {
        return date;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }
}
