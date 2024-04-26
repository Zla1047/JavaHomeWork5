package org.example;

public class Main {
    public static void main(String[] args) {

        MyInt a1, a2;
        a1 = new MyInt(3);
        a2 = a1;

        System.out.println(a1.x+" "+a2.x);

        a1.x = 10;
        System.out.println(a1.x+" "+a2.x);

        Point[] points = new Point[] {
                new Point(1, 3),
                new Point(2, 3),
                new Point(4, 2),
                new Point(5, 4)
        };

        System.out.println("All points:");
        for (int i = 0; i < points.length; i++) {
            points[i].info();
        }

        System.out.println("\nPoints with coordinates x and y divisible by 2:");
        for (int i = 0; i < points.length; i++) {
            if (points[i].getX() % 2 == 0 && points[i].getY() % 2 == 0) {
                points[i].info();
            }
        }

    }
}