package solid.calculators;

import solid.products.Product;
import solid.products.food.Chocolate;
import solid.products.drink.Coke;
import solid.products.drink.Lemonade;

import java.util.List;

public class CalorieCalculator implements Calculator {

    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

    public CalorieCalculator() {
    }

    public double sum(List<Product> products) {
        double sum = 0;

        for (Product product : products) {
                sum += product.getCalories();

        }

        return sum;
    }

    public double average(List<Product> products) {
        return sum(products) / products.size();
    }


}
