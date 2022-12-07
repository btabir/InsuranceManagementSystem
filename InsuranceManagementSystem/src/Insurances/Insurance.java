package Insurances;

import java.util.Calendar;
import java.util.Date;

public abstract class Insurance {
    Calendar calendar = Calendar.getInstance();
    private String name;
    private double price;
    private Date starting;
    private Date ending;

    public Insurance(String name,Date starting, Date ending) {
        this.name = name;
        this.starting = starting;
        this.ending = ending;
    }

    public abstract void calculate(String insuranceType);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStarting() {
        return starting;
    }

    public void setStarting(Date starting) {
        this.starting = starting;
    }

    public Date getEnding() {
        return ending;
    }

    public void setEnding(Date ending) {
        this.ending = ending;
    }
}
