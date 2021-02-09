package com.itacademy.lesson6;

public class HWTask1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle (new Point(1,4), new Point(4,2));

        System.out.println("Площадь прямоугольника: " + rectangle.square(rectangle.getPointLeftUp(), rectangle.getPointRightDown()));
        System.out.println("Длина диагонали прямоугольника: " + rectangle.diagonal(rectangle.getPointLeftUp(), rectangle.getPointRightDown()));

    }
}
