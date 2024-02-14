package solid.products.food;

public class Chocolate extends FoodBase{

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        super(grams,CALORIES_PER_100_GRAMS);
    }

    public double getGrams() {
        return grams;
    }
}
