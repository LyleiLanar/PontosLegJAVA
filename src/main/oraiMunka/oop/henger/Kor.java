package main.oraiMunka.oop.henger;

public class Kor {
    private double radius;

    public Kor(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getTerulet(){
        return Math.pow(radius,2)* Math.PI;
    }
}
