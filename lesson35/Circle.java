package lesson35;

/**
 * Created by Kuba on 04/03/2019.
 */
public class Circle {
    private double radius;

     public Circle(double radius){

     }
    public double getRadius(){
        if(radius<0){

            return radius=0;
        }
        else
        {
            return radius;
        }
    }
}
