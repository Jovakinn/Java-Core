package org.lambda.functional;

import org.lambda.model.Car;
import org.lambda.model.Color;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class CarsRunner {
    private static final Logger LOGGER = Logger.getLogger(CarsRunner.class.getName());

    public static ArrayList<Car> createCars(Supplier<Car> carSupplier, Integer amountOfCars) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < amountOfCars; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCarsList = createCars(() ->
                new Car("Hyundai", Color.BLACK, 50000.0), 7);
        LOGGER.info(String.valueOf(ourCarsList));
    }
}
