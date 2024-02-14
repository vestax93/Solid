package solid.products.food;

public class Chips extends FoodBase{
    public static final double CALORIES_PER_100_GRAMS = 529.0;

    private double grams;

    public Chips(double grams) {
        super(grams,CALORIES_PER_100_GRAMS);
    }

    public double getGrams() {
        return grams;
    }
}
