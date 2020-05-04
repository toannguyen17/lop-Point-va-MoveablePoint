package test;

import app.MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.toString());

        System.out.println(moveablePoint.getSpeed());

        moveablePoint.setxSpeed(21.2f);
        System.out.println(moveablePoint.move());

        moveablePoint.setySpeed(21.2f);
        System.out.println(moveablePoint.move());

        moveablePoint.setXY(3.2f, 8.0f);
        System.out.println(moveablePoint.move());

        moveablePoint = new MoveablePoint(3.2f, 8.0f);
        System.out.println(moveablePoint.move());

        moveablePoint = new MoveablePoint(3.2f, 8.0f, 1.0f, 6.0f);
        System.out.println(moveablePoint.move());
    }
}
