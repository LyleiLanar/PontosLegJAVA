package main.autok;

import main.enums.Color;
import main.enums.Fuel;
import main.enums.ShifterType;

import java.util.Scanner;

public class Car {


    //region fields
    private String brand;
    private String type;
    private int year;
    private int price;
    private Color color;
    private int kms;
    private Fuel fuel;
    private ShifterType shifter;
    //endregion

    //region getter, setter
    public String getBrand() {

        Scanner sc = new Scanner(System.in);
        sc.toString();
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public ShifterType getShifter() {
        return shifter;
    }

    public void setShifter(ShifterType shifter) {
        this.shifter = shifter;
    }

//endregion

    //region constructor
    public Car(String brand, String type, int year, int price, Color color, int kms, Fuel fuel, ShifterType shifter) {
    setBrand(brand);
    setType(type);
    setYear(year);
    setPrice(price);
    setColor(color);
    setKms(kms);
    setFuel(fuel);
    setShifter(shifter);
    }
    //endregion

    //region methods

    public String toText() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(brand + ", ");
        sb.append(type + ", ");
        sb.append(year + ", ");
        sb.append(price + ", ");
        sb.append(color + ", ");
        sb.append(kms + ", ");
        sb.append(fuel + ", ");
        sb.append(shifter);
        sb.append(">");

        return sb.toString();
    }

    //endregion
}
