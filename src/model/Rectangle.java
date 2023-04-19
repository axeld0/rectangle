package model;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;


    /**
     * constructor
     */
    public Rectangle ()
    {
        width = 1;
        height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    /**
     *GETTERS AND SETTERS
     */
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getArea ()
    {
        double area = width * height;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * (width + height);
        return perimeter;
    }

}
