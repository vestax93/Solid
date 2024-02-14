package solid.products.drink;

import solid.products.Product;

public abstract class DrinkBase implements Drink {
    private final double milliliters;
    private final double density;
    private final double caloriesPer100Grams;

    public DrinkBase(double milliliters, double density, double caloriesPer100Grams) {
        this.milliliters = milliliters;
        this.density = density;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    @Override
    public double getCalories() {
        return calculateCalories();
    }

    private double calculateCalories() {
        double grams = this.milliliters * this.density;
        return (caloriesPer100Grams / 100) * grams;
    }

    @Override
    public double getLiters() {
        return calculateLiters();
    }

    public double getKilograms(){
        return caluclateKilograms();
    }

    private double caluclateKilograms() {
        return this.getLiters() * this.density;
    }

    private double calculateLiters() {
        return this.milliliters / 1000;
    }

    @Override
    public double getDensity() {
        return this.density;
    }
}
