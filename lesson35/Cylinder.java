package lesson35;

/**
 * Created by Kuba on 04/03/2019.
 */
public class Cylinder extends Circle {
    // write your code here
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
