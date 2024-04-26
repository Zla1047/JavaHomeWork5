package org.example;

public class Point {

    public int x;
    public int y;

    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public void info()
    {
        System.out.println("Point coordinates: " +x + ", " +y );
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
