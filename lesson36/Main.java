package lesson36;

/**
 * Created by Kuba on 05/03/2019.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.Length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Cuboid.Width= " + cuboid.getWidth());

        System.out.println("Cuboid.Length= " + cuboid.getLength());

        System.out.println("Cuboid.Area= " + cuboid.getArea());

        System.out.println("Cuboid.Height= " + cuboid.getHeight());

        System.out.println("Cuboid.Volume= " + cuboid.getVolume());


    }
}
