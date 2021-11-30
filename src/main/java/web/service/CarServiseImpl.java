package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService{
    @Override
    public List<Car> tableCar(int count) {

        List<Car> carsOut = new ArrayList();
        {
            carsOut.add(new Car("Lada Kalina", "red", 86));
            carsOut.add(new Car("Hyundai Solaris", "white", 120));
            carsOut.add(new Car("Lada Granta", "gray", 101));
            carsOut.add(new Car("Nissan Murano", "green", 150));
            carsOut.add(new Car("Hyundai SONATA", "black", 118));
        }
        List<Car> carsOutV =  carsOut.subList(0, count);

        return carsOutV;
    }
}
