package solid.products.drink;

import solid.products.Product;

public class Coke extends DrinkBase {

    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;

    private double milliliters;

    public Coke(double milliliters) {
        super(milliliters,DENSITY,CALORIES_PER_100_GRAMS);
    }

    public double getMilliliters() {
        return milliliters;
    }
}
