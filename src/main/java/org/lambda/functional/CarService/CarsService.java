package org.lambda.functional.CarService;

import org.lambda.model.Car;
import org.lambda.model.Color;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CarsService {

    public static ArrayList<Car> createCars(Supplier<Car> carSupplier, Integer amountOfCars) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < amountOfCars; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeColorOfCarsRed(ArrayList<Car> arrayList) {
        Consumer<ArrayList<Car>> carConsumer = cars -> cars.forEach(car -> car.setColor(Color.RED));
        carConsumer.accept(arrayList);
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
}
