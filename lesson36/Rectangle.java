package lesson36;

/**
 * Created by Kuba on 05/03/2019.
 */
public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0) {
            width = 0;
        } else
            this.width = width;
        if (length < 0) {
            length = 0;
        } else
            this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
