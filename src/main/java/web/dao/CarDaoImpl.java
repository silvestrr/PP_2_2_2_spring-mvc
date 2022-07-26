package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.mоdel.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl {
    private List<Car> cars = new ArrayList<>();
    public List<Car> saveCar() {
        cars.add(new Car(1, "BMW", "X6"));
        cars.add(new Car(2, "Mercedes", "e200"));
        cars.add(new Car(3, "Volkswagen", "polo"));
        cars.add(new Car(4, "Ford", "Mustang"));
        cars.add(new Car(5, "car5", "car5"));
        return cars;
    }
    public List<Car> getCars() {return cars;}


}
