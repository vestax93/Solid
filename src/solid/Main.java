package solid;

import solid.calculators.CalorieCalculator;
import solid.calculators.QuantityCalculator;
import solid.products.Product;
import solid.products.drink.Coke;
import solid.products.food.Chips;
import solid.products.food.Chocolate;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Chocolate(100),
                new Chips(200),
                new Coke(100)
        );

        CalorieCalculator cal = new CalorieCalculator();
        Printer printer = new Printer(cal);
        printer.printSum(list);
        printer.printAverage(list);
        QuantityCalculator quantityCalculator = new QuantityCalculator();
        Printer print2 = new Printer(quantityCalculator);
        print2.printSum(list);
        print2.printAverage(list);

    }
}
