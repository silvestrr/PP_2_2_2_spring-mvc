package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.mоdel.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private final CarDaoImpl carDao;
    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> saveCar() {
        return carDao.saveCar();
    }
    public List<Car> getSpecifiedByNumberOfCars(int count) {
        if (count == 0) {
            return carDao.getCars();
        } else {
            return carDao.getCars().stream().limit(count).collect(Collectors.toList());
        }

    }
}
