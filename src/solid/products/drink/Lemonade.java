package solid.products.drink;

public class Lemonade extends DrinkBase{

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
        super(milliliters, DENSITY, CALORIES_PER_100_GRAMS);
    }

    public double getMilliliters() {
        return milliliters;
    }
}
