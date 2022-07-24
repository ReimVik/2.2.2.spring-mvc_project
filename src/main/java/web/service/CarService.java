package web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import web.models.Car;
@Service
public interface CarService {
        public List<Car> showAllCars();

        public List<Car> showSameCars(int count);
}

