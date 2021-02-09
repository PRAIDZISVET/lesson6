package com.itacademy.lesson6;

public class Point {

    private int x;
    private  int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance (Point value) {
        return Math.sqrt(Math.pow(value.x,2) + Math.pow(value.y,2));
    }
}
