package com.itacademy.lesson6;

public class Rectangle {

    private Point pointLeftUp;
    private Point pointRightDown;


    public Rectangle(Point pointLeftUp, Point pointRightDown) {
        this.pointLeftUp = pointLeftUp;
        this.pointRightDown = pointRightDown;
    }

    public double square (Point pointLeftUp, Point pointRightDown) {
        return (pointRightDown.getX() - pointLeftUp.getX()) * (pointLeftUp.getY() - pointRightDown.getY());
    }

    public double diagonal (Point pointLeftUp, Point pointRightDown) {
        return Math.sqrt(Math.pow(pointRightDown.getX() - pointLeftUp.getX(),2) + Math.pow(pointLeftUp.getY() - pointRightDown.getY(),2));
    }

    public Point getPointLeftUp() {
        return pointLeftUp;
    }

    public Point getPointRightDown() {
        return pointRightDown;
    }
}

