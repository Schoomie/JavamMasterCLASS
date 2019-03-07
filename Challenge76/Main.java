package Challenge76;

import java.util.ArrayList;

abstract class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Bram");
    }

    public void accelerate() {
        System.out.println("ziuuuuuuUUUUUUUUUUUUUUU");
    }

    public void brake() {
        System.out.println("PIIIIIIIISK");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    abstract String getColour();
}

class KIAPicanto extends Car {
    String colour;

    public String getColour() {
        return colour;
    }

    public KIAPicanto(String colour) {
        super(4, "Picanto");
        this.colour = colour;
    }

    @Override
    public void accelerate() {
        System.out.println("wolnebopicanto");
    }
}

class KIASoul extends Car {
    String colour;

    public String getColour() {
        return colour;
    }

    public KIASoul(String colour) {
        super(4, "Soul");
        this.colour = colour;

    }
}

public class Main {
    public static void main(String[] args) {
        Car num1 = new KIAPicanto("blue");
        num1.accelerate();
        num1.startEngine();
        Car num2 = new KIASoul("zielony");

        ArrayList<Car> a = new ArrayList<>();
        a.add(num1);
        a.add(num2);
        num1.getCylinders();
        System.out.println(num1.getColour());
        for (Car x : a) {
            System.out.println(x.getClass());

        }
    }

}
