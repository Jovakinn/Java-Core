package org.lambda.functional.CarService;

import org.lambda.functional.CarService.CarsService;
import org.lambda.model.Car;
import org.lambda.model.Color;
import java.util.ArrayList;
import java.util.logging.Logger;

public class CarRunner {
    private static final Logger LOGGER = Logger.getLogger(CarsService.class.getName());

    public static void main(String[] args) {
        ArrayList<Car> ourCarsList = CarsService.createCars(() ->
                new Car("Hyundai", Color.BLACK, 50000.0), 7);
        LOGGER.info(String.valueOf(ourCarsList));

        CarsService.changeColorOfCarsRed(ourCarsList);
        CarsService.changeCar(ourCarsList.get(0), car -> {
            car.setColor(Color.BLACK);
            car.setModelName("Honda");
            car.setPrice(9999.9);
        });
        LOGGER.info(String.valueOf(ourCarsList));
    }
}
