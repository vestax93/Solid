package solid.products.food;

import solid.products.Product;

public abstract class FoodBase implements Food {
    private final double grams;
    private final double caloriesPer100Grams;

    public FoodBase(double grams, double caloriesPer100Grams) {
        this.grams = grams;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    @Override
    public double getCalories() {
        return calculateCalories();
    }

    private double calculateCalories() {
        return (caloriesPer100Grams / 100) * grams;
    }

    @Override
    public double getKilograms() {
        return calculateKilograms();
    }

    private double calculateKilograms() {
        return grams / 1000;
    }
}
