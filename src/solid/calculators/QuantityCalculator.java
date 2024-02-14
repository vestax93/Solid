package solid.calculators;

import solid.products.Product;
import solid.products.drink.DrinkBase;
import solid.products.food.FoodBase;

import java.util.List;

public class QuantityCalculator implements Calculator{


    @Override
    public double sum(List<Product> products) {
        double sum = 0.0;
        for (Product product : products){
            if(product instanceof DrinkBase){
                sum += ((DrinkBase) product).getKilograms();
            } else if (product instanceof FoodBase){
                sum += ((FoodBase) product).getKilograms();
            }
        }
        return sum;
    }

    @Override
    public double average(List<Product> products) {
        return sum(products) / products.size();
    }

}
