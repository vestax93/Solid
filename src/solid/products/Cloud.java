package solid.products;

import solid.products.food.Food;
import solid.products.food.FoodBase;

public class Cloud extends FoodBase {
    public Cloud(double grams, double caloriesPer100Grams) {
        super(grams, caloriesPer100Grams);
    }

    @Override
    public double getCalories() {
        throw new NullPointerException("");
    }

    @Override
    public double getKilograms() {
        return 0;
    }
}
