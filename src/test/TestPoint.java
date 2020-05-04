package test;

import app.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());

        point.setX(2.2f);
        System.out.println(point.toString());

        System.out.println(point.getXY());

        point.setY(8.2f);
        System.out.println(point.toString());

        point.setXY(3.2f, 8.0f);
        System.out.println(point.toString());

        point = new Point(3.2f, 8.0f);
        System.out.println(point.toString());
    }
}
