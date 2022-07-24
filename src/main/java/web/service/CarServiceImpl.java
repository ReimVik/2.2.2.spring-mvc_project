package web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import web.models.Car;

public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("LADA", "White", 600000));
        cars.add(new Car("Mercedes", "Black", 5000000));
        cars.add(new Car("BMW", "Grey", 4500000));
        cars.add(new Car("Volkswagen", "Blue", 2300000));
        cars.add(new Car("KAMAZ", "Orange", 7150000));
    }
    @Override
    public List<Car> showAllCars() {
        return cars;
    }
    @Override
    public List<Car> showSameCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
