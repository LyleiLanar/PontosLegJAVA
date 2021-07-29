package main.adventOfCode.ms3;

public class Koord {
    @Override
    public String toString() {
        return "Koord{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    private int x;
    private int y;

    public Koord(int x, int y) {
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            x = 0;
        }
        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {
        if (y < 0) {
            y = 0;
        }
        this.y = y;
    }
}
